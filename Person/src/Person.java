public class Person {
	
	private String m_name;
	private int m_age;
	private String m_phoneNumber;
	private String m_address;

	// Contructer
	public Person(String name,int age,String phoneNumber,String address){
		setName(name);
		m_age = age;
		m_phoneNumber = phoneNumber;;
		m_address = address;
	}
	
	// Single Age increment
	int growsOlder(){
		return m_age++;
	}
	
	// Gets Name
	public String getName() {
		return m_name;
	}
	
	// Sets Name
	private void setName(String name) {
		m_name = name;
	}
	
	// Gets Age
	public int getAge() {
		return m_age;
	}

	// Sets Age
	@SuppressWarnings("unused")
	private void setAge(int age) {
		m_age = age;
	}
	
	// Gets Number
	public String getNumber() {
		return m_phoneNumber;
	}

	// Sets Number
	@SuppressWarnings("unused")
	private void setNumber(String number) {
		m_phoneNumber = number;
	}
	
	// Gets Adress
	public String getAddress() {
		return m_address;
	}

	// Sets Address
	@SuppressWarnings("unused")
	private void setAddress(String address) {
		m_address = address;
	}
}
