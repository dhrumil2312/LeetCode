import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SubDomainVisit {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        String delims = "[ .]+";
        HashMap<String , Integer> hs = new HashMap<>();
        List<String> ans;

        for(String cpd : cpdomains){
            String[] current = cpd.split(delims);
            int count = Integer.parseInt(current[0]);
            String insert= "";
            for(int i = current.length-1 ; i > 0 ; i--){
                System.out.println(i + " " + insert);
                 if (i==current.length-1){
                     insert = current[i];
                 }
                 else{
                     insert = current[i] + '.'+insert;
                 }

                if (!hs.containsKey(insert)) {
                    hs.put(insert, count);
                } else {
                    int old = hs.get(insert);
                    hs.put(insert, old + count);
                }
            }

            System.out.println(Collections.singletonList(hs));
        }

        ans = hs.entrySet().stream().map(entry -> entry.getValue() + " " + entry.getKey()).collect(Collectors.toList());

        System.out.println(ans);;
    }
}
