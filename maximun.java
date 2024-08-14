import Tree.LevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class maximun {
    static boolean matrixcnt(int n, int m, List<String>mat) {
        if (m<4)return false;
        char[][] ch = new char[n][m];
        int i = 0;
        for (String st : mat) {
            ch[i++] = st.toCharArray();
        }

        boolean p = false, l = false, a = false, y = false;
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                if (ch[k][j] == 'p' && !p) {
                    p = true;
                    break;
                }
                else if (ch[k][j] == 'l' && p && !l){
                    l = true;
                    break;
                }
                else if (ch[k][j] == 'a' && p && l && !a) {
                    a = true;
                    break;
                }
                else if (ch[k][j] == 'y' && p && l && a && !y) {
                    y = true;
                    break;
                }
            }
        }

    return  p&&l&&a&&y;
    }

    public static void main(String[] args) {
        List<String>ls = new ArrayList<>();
        ls.add("hbqjwjwljopagjitbasygz");
        ls.add("ogkqavypcqpktjfunhzbni");
        ls.add("bhuahctlsimhjpznhlnlpj");



        System.out.println(matrixcnt(3,22,ls));
    }
}
