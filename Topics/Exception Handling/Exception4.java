public class Exception4 {

	public static void main(String[] args) {
		int n = args.length;

		for (int i = 0; i < n; i++)
			if (args[i].charAt(args[i].length() - 1) == ',')
				args[i] = args[i].replace(",", "");

		int[] arr = new int[n];

		int sum = 0;
		double avg = 0;

		try {
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(args[i]);

			for (int i = 0; i < n; i++)
				sum += arr[i];

			avg = sum / n;
		} catch (Exception e) {
			System.out.println(e.getClass().getCanonicalName());
		}

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}
}
