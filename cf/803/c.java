import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class c {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        // cannot have more than 2 positive numbers or 32
        int t = sc.nextInt();
        for (int _i = 0; _i < t; _i++) {
            int n = sc.nextInt();
            int[] a = sc.readIntArray(n);
            List<Integer> p = new ArrayList<>();
            List<Integer> neg = new ArrayList<>();
            int numZero = 0;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (a[i] < 0) {
                    neg.add(a[i]);

                } else if (a[i] > 0) {
                    p.add(a[i]);
                } else {
                    numZero++;
                }
                set.add(a[i]);
            }

            if (p.size() > 2 || neg.size() > 2) {
                System.out.println("NO");
                continue;
            }
            
            int z = p.size() + neg.size();
            boolean ans = true;
            int[] posNeg = new int[z];
            int c = 0;
            for (int i = 0; i < p.size(); i++) {
                posNeg[c++] = p.get(i);
            }
            for (int i = 0; i < neg.size(); i++) {
                posNeg[c++] = neg.get(i);
            }
            for (int i = 0; i < z; i++) {
                for (int j = 0; j < z; j++) {
                    for (int k = 0; k < z; k++) {
                        if (i != j && j != k && i != k) {
                            if (!set.contains(posNeg[i] + posNeg[j] + posNeg[k])) {
                                ans = false;
                            }
                        }
                    }
                }
            }
            
            if (numZero > 0) {
                for (int i = 0; i < z; i++) {
                    for (int j = 0; j < z; j++) {
                        if (i != j) {
                            if (!set.contains(posNeg[i] + posNeg[j])) {
                                ans = false;
                            }
                        }
                    }
                }
            }

            if(!ans) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }


        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public String[] readStringArrayLine(int n) {
            String line = "";
            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line.split(" ");
        }

        public String[] readStringArrayLines(int n) {
            String[] result = new String[n];
            for (int i = 0; i < n; i++) {
                result[i] = this.next();
            }
            return result;
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = this.nextInt();
            }
            return result;
        }

        public Integer[] readIntArrayObject(int n) {
            Integer[] result = new Integer[n];
            for (int i = 0; i < n; i++) {
                result[i] = this.nextInt();
            }
            return result;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char[] readCharArray(int n) {
            return this.nextLine().toCharArray();
        }

    }
}