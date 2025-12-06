package tech.ewrey.repeatable;

public class BinarySearch {

    static int[] ARRAY = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    static int TARGET = 5;

    public static void main(String[] args) {
//        System.out.println(binarySearch(ARRAY, TARGET));
//        System.out.println(binarySearch_v2(ARRAY, TARGET));
//        System.out.println(binarySearch_v3(ARRAY, TARGET));
        System.out.println(binarySearch_v3(ARRAY, 14));
//        System.out.println(binarySearch_v6(ARRAY, 14));
    }

    static int binarySearch_v6(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int i = 1;

        while (left <= right) {
            System.out.println("i=" + i++);
            int mid = left + ((right - left) / 2);
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    static int binarySearch_v5(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[left] == target) return left;
            else if (arr[right] == target) return right;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    static int binarySearch_v4(int[] arr, int target) {
        int left = 0;
        int right = arr.length / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    static int binarySearch_v3(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    static int binarySearch_v2(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] == target) return target;
            else if (arr[left] == target) return left;
            else if (arr[right] == target) return right;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[left] == target) return left;
            else if (arr[right] == target) return right;

            else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
