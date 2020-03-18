import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer T = Integer.parseInt(in.nextLine());
		int[] print = new int[T];
		for (int i = 0; i < T; i++) {
			String l = in.nextLine();
			String[] s = l.split(" ");

			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);

			int[] tags = new int[M];

			String str = in.nextLine();

			String[] sp = str.split(" ");
			for (int k = 0; k < tags.length; k++) {
				tags[k] = Integer.parseInt(sp[k]);
			}
			Arrays.sort(tags);

			int total=0;
			for (int j = 0; j < tags.length; j++) {
				total+=tags[j];
				if (total>=N){
print[i] = j;
break;
				}else {
					if (j==tags.length-1){
						print[i] = j+1;

					}
				}
			}

		}
		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}
}