
class Address {
	Integer rollnumber = -25;
	
	public int hashCode() {
		return rollnumber;
	}
	public static void main(String[] args) {
		Address a = new Address();
		System.out.println(a);
	}
}
