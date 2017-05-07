public class Rectangle
{
	public static void main(String[] args)
	{
		int length, width, area;

		length = IO.readInt();
		if (length <= 0) {
			IO.reportBadInput();
			return;
		}

		width = IO.readInt();
		if (width <= 0) {
			IO.reportBadInput();
			return;
		}

		area = length * width;
		IO.outputIntAnswer(area);
	}
}