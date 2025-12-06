package tech.ewrey.util;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        List<List<String>> lines = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        List<TreeNode> next = new ArrayList<>();

        level.add(this);
        int nn = 1;
        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<>();
            nn = 0;
            for (TreeNode n : level) {
                if (n == null) {
                    line.add(null);
                    next.add(null);
                    next.add(null);
                } else {
                    String aa = String.valueOf(n.val);
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.left);
                    next.add(n.right);

                    if (n.left != null) nn++;
                    if (n.right != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;
            lines.add(line);
            List<TreeNode> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;
            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '┴' : '┘';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '└';
                        }
                    }
                    sb.append(c);

                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            sb.append(' ');
                        }
                    } else {
                        for (int k = 0; k < hpw; k++) {
                            sb.append(j % 2 == 0 ? " " : "─");
                        }
                        sb.append(j % 2 == 0 ? "┌" : "┐");
                        for (int k = 0; k < hpw; k++) {
                            sb.append(j % 2 == 0 ? "─" : " ");
                        }
                    }
                }
                sb.append('\n');
            }

            for (String f : line) {
                if (f == null) f = "";
                float a = perpiece / 2f - f.length() / 2f;
                int gap1 = (int) Math.ceil(a);
                int gap2 = (int) Math.floor(a);

                for (int k = 0; k < gap1; k++) {
                    sb.append(' ');
                }
                sb.append(f);
                for (int k = 0; k < gap2; k++) {
                    sb.append(' ');
                }
            }
            sb.append('\n');

            perpiece /= 2;
        }
        return sb.toString();
    }
}
