package lineComp;

public class LineComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		int x1 = 2;
		int x2 = 5;
		int y1 = 5;
		int y2 = 2;
		int x3 = 2;
		int x4 = 5;
		int y3 = 5;
		int y4 = 2;
		double lengthOfLine1 = (int) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		double lengthOfLine2 = (int) Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		Integer obj1 = new Integer((int)lengthOfLine1);
		Integer obj2 = new Integer((int)lengthOfLine2);
		System.out.println("The points x1= " +x1);
		System.out.println("The points x2= " +x2);
		System.out.println("The points y1= " +y1);
		System.out.println("The points y2= " +y2);
		System.out.println("The points x3=" +x3);
		System.out.println("The points x4=" +x4);
		System.out.println("The points y3=" +y3);
		System.out.println("The points y4=" +y4);
		System.out.println("Length of Line1 = " + lengthOfLine1);
		System.out.println("Length of Line2 =" + lengthOfLine2);
		System.out.println("Line1 and line2 are Equal : "+ obj1.equals(obj2));
		System.out.println("Comparing 2 Lines : "+ obj1.compareTo(obj2));

	}

}
