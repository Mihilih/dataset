import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	List<Long> constraints = new ArrayList<>();
	long N;
	long result;

	Main() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		this.N = Long.parseLong(in.readLine());
		for (int i = 0; i < 5; ++i) {
			this.constraints.add(Long.parseLong(in.readLine()));
		}
		in.close();

		this.calc();
	}

	void calc() {
		long min = Long.MAX_VALUE;
		for (Long c : this.constraints) {
			min = Math.min(min, c);
		}
		long time = this.N / min;
		if (this.N % min != 0) {
			++time;
		}
		time += 4;
		this.result = time;
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		System.out.println(ins.result);

	}

}
