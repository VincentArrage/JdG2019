import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PathFinder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("mountain.txt");
		// int time = 0;
		StringTokenizer toke;
		int h = 0, r = 0, c = 0;
		int[][][] arrStage = new int[h][r][c];

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = false;
		/*String st;
		while ((st = br.readLine()) != null) {
			// System.out.println(st);
			toke = new StringTokenizer(st, " ");
			for (int i = 0; i < h; i++) {
				if (!st.equals("$")) {
					while (toke.hasMoreElements()) {
						if (!flag) {
							r = Integer.parseInt(toke.nextToken());
							c = Integer.parseInt(toke.nextToken());
							h = Integer.parseInt(toke.nextToken());
							flag = true;
							i = i - 1;
						} else {
							for (int j = 0; j < r; j++) {
								for (int k = 0; k < c; k++) {
									arrStage[h][r][c] = Integer.parseInt(toke.nextToken());
								}
							}
						}
						// System.out.println(toke.nextElement());
					}
				}
			}
			System.out.println("");
		}*/
		
		String st;
		st = br.readLine();
		toke = new StringTokenizer(st, " ");
		
		//read first line
		while (toke.hasMoreTokens()) {
			r = Integer.parseInt(toke.nextToken());
			c = Integer.parseInt(toke.nextToken());
			h = Integer.parseInt(toke.nextToken());
		}
		
		//read next lines
		while ((st = br.readLine()) != null) {
			toke = new StringTokenizer(st, " ");
			h = 0;
			while (toke.hasMoreTokens()) {
				for (int j = 0; j < r; j++) {
					for (int k = 0; k < c; k++) {
						arrStage[h][j][k] = Integer.parseInt(toke.nextToken());
					}
				}
			}
			h++;
		}
		
		//test
		//System.out.println(h + "  " + r + "  " + c);//arrStage[0][0][0]);
		/*for (int i = 0; i < h; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < c; k++) {
					System.out.println(arrStage[h][r][c]);
				}
			}
		}*/

	}

	public void getAction(int num) {
		if (num == 1) {
			// go back
		} else if (num == 0) {
			// go forward & save
		} else if (num == 10) {
			// go up
		} else if (num == 11) {
			// go down
		} else if (num == 12) {
			// go up or down
		}
	}

}
