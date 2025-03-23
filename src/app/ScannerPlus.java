package app;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.InputStream;
import org.jetbrains.annotations.Nullable;

public class ScannerPlus {
	private final Scanner scanner;

	public ScannerPlus(InputStream source) {
		this.scanner = new Scanner(source);
	}

	public String nextString(@Nullable String prompt) {
		String result;

		if (prompt != null) {
			System.out.print(prompt);
		}

		while (true) {
			try {
				result = this.scanner.nextLine();
				break;
			} catch (InputMismatchException _) {
				System.out.print("Invalid input. Please try again: ");
				this.scanner.next();
			}
		}

		return result;
	}

	public String nextString() {
		return this.nextString(null);
	}

	public int nextInt(@Nullable String prompt) {
		int result = 0;

		if (prompt != null) {
			System.out.print(prompt);
		}

		while (true) {
			try {
				result = this.scanner.nextInt();
				this.scanner.skip("\n");
				break;
			} catch (InputMismatchException _) {
				System.out.print("Invalid input. Please try again: ");
				this.scanner.next();
			}
		}

		return result;
	}

	public int nextInt() {
		return this.nextInt(null);
	}

	public float nextFloat(@Nullable String prompt) {
		float result;

		if (prompt != null) {
			System.out.print(prompt);
		}

		while (true) {
			try {
				result = this.scanner.nextFloat();
				this.scanner.skip("\n");
				break;
			} catch (InputMismatchException _) {
				System.out.print("Invalid input. Please try again: ");
				this.scanner.next();
			}
		}

		return result;
	}

	public float nextFloat() {
		return this.nextFloat(null);
	}

	public double nextDouble(@Nullable String prompt) {
		double result;

		if (prompt != null) {
			System.out.print(prompt);
		}

		while (true) {
			try {
				result = this.scanner.nextDouble();
				this.scanner.skip("\n");
				break;
			} catch (InputMismatchException _) {
				System.out.print("Invalid input. Please try again: ");
				this.scanner.next();
			}
		}

		return result;
	}

	public double nextDouble() {
		return this.nextDouble(null);
	}

	public boolean nextBoolean(@Nullable String prompt) {
		boolean result;

		if (prompt != null) {
			System.out.print(prompt);
		}

		while (true) {
			try {
				result = this.scanner.nextBoolean();
				this.scanner.skip("\n");
				break;
			} catch (InputMismatchException _) {
				System.out.print("Invalid input. Please try again: ");
				this.scanner.next();
			}
		}

		return result;
	}

	public boolean nextBoolean() {
		return this.nextBoolean(null);
	}

	public void close() {
		this.scanner.close();
	}
}