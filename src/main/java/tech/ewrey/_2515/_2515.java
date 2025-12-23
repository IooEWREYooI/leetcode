package tech.ewrey._2515;

import tech.ewrey.util.Array;

public class _2515 {

    public static void main(String[] args) {
        System.out.println(closestTarget(Array.of("hello","i","am","leetcode","hello"), "hello", 1));
        System.out.println(closestTarget(Array.of("hello","i","am","leetcode","hello"), "i", 1));
        System.out.println(closestTarget(Array.of("lwgdugypkmsvxwhwbrccrbtemvudwhctnaaonednsbodptendi","lumylagwxpmmivpujfawgvdbtxpluwekdpeakrqelpvrflnsnr","lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj","nabbqiyarxmzleesxrfaynypfxonyhvwhebfjsxyinepggxnns","oiqghjtvrhpgvsjlzmrwbwpmomqqliqytdzawhkwematskflgf","dtiwjpdgcsmhaiwxrgligxlibfmvclobjjhljrqlvpuiufskix","svqgvooghuqszkrmcrayqclotygdqnxfetdrfrfvbypgiizzdk","qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw","ihaekjyxvnmhvtanysybyqvrtmffpkgmnxisgmmhkhbtonlwgo","ucrvwdlifpckbimcvevgsniepuewjqpakwnxksumgvrnmhmtuk","lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj","lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj","vdtvcclyyraevotgikgojlbefpfmlzypychxehnglgettackoz","qxspwpzxfxyxalrjuliwtbyllamkifbknnhzyfeabavwvvdkzk","vdtvcclyyraevotgikgojlbefpfmlzypychxehnglgettackoz","ucrvwdlifpckbimcvevgsniepuewjqpakwnxksumgvrnmhmtuk","dtiwjpdgcsmhaiwxrgligxlibfmvclobjjhljrqlvpuiufskix","vtbfahotrkxwcfwzlijfoqdkrvdmavpllbcfvibrqeuntsmrcs","mfhqksxfeeltpiupaijavavbpphjxyuzqlqehirxnmviiaqnfv","oowbnwbktlmsawtbilyvksqkbuohhjxqbepxgklkrwpjzcvipe","mpnnvwuqbczvmrwhzvsmtuumwjczqehuumjvfbpgoxlurjbckq","byaschxhjcgnnodazzpisqriyszffaqqiwljbuigdvzzobrlmc","dmctcimgeztojrvqwyygmnzfwtsrmmbgednmytsludnrpjjjvk","qxspwpzxfxyxalrjuliwtbyllamkifbknnhzyfeabavwvvdkzk","cawzflwjjopbemxqazpsrsrlxljwqlvzpvjbjarqeqgythrsou","ydqjqvalipkkrcbdprgjjangclswdjpaajiwhxeupidxirlith","lwgdugypkmsvxwhwbrccrbtemvudwhctnaaonednsbodptendi","ejtkmbyqtwrlhwynnqggpjaaaydjqnczhtyphfgugpbardzlvj","cawzflwjjopbemxqazpsrsrlxljwqlvzpvjbjarqeqgythrsou","oowbnwbktlmsawtbilyvksqkbuohhjxqbepxgklkrwpjzcvipe","khhwlijglujhgimvfvuwgggigppichzscdtsiklalgqeqsencq","khhwlijglujhgimvfvuwgggigppichzscdtsiklalgqeqsencq","lngqwiijizfzzhlvvszaownnachqunlktsnhgsjeluvcpmavuj","frdsoraagsllmgtatzybegxotrtgsuwfzpzxkpegggvpodnhrr","ynuartuisymsqxxdqwndonpqhczqpuekwbayfidfisjpriqogx","shmpixycafoqskoegqfvsrvboiegqwlbrkiuoeetncdxqlqsov","oiqghjtvrhpgvsjlzmrwbwpmomqqliqytdzawhkwematskflgf","xjtatoefvpwwgsvmepltadmzngxtnahqypfxgjppbqsmqnjvxm","vtbfahotrkxwcfwzlijfoqdkrvdmavpllbcfvibrqeuntsmrcs","dmctcimgeztojrvqwyygmnzfwtsrmmbgednmytsludnrpjjjvk","dsohnrdxdqrbwdjhqpphwvlzfyizqyoedckthdlhmkxjxewubc","qriythowwswwwucgwmezpqqneatemdxfqzpeytlozzojguywby","lyhmqyjnztwzqotqkpmvpueyzjfroousgkkerqvmwjnjtmlkuf","qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw","qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw","gxrtwoayoosijaddrlbvxqsvbbvaziqemcpxgljlnexvjnnakk","mjftbskulmuztejkopyftjsdeoyuvhvqragbkqlfhgqqkafvau","mjftbskulmuztejkopyftjsdeoyuvhvqragbkqlfhgqqkafvau","qzrmfzdiodkdbhwifsinmamljlztwqtaoivufkcyeydsvpmdzw","qxspwpzxfxyxalrjuliwtbyllamkifbknnhzyfeabavwvvdkzk"), "ydqjqvalipkkrcbdprgjjangclswdjpaajiwhxeupidxirlith", 0));
    }

    public static int closestTarget(String[] words, String target, int startIndex) {
        if (startIndex >= words.length) return -1;
        for (int i = 0, n = words.length, l = startIndex, r = l; i < n;
             l = l - 1 < 0 ? (l - 1 + n) % n : l - 1,
             r = r + 1 >= n ? (r + 1 - n) % n : r + 1, i++) {
            if (target.equals(words[l]) || target.equals(words[r])) return i;
        }

        return -1;
    }

}
