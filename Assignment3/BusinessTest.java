import java.util.ArrayList;

public class BusinessTest 
{
	public static void sop(Object msg)
	{
		System.out.println(msg);
	}
	
	public static void sop()
	{
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		ArrayList<Address> addys = new ArrayList<Address>();
		for(int i = 0; i < 12; i++)
		{
			Address newAddy = new Address();
			newAddy.setCity("San Jose");
			newAddy.setState("CA");
			newAddy.setStreetName(i + "th St");
			newAddy.setStreetNum(i+ "132");
			newAddy.setZip("95112");
			addys.add(newAddy);
		}
		
		Customer jack = new Customer("Jack", "Dan", addys.get(0));
		jack.setAge(10);
		jack.setId("0156249");
		jack.setLevelOfEd("Middle School");
		jack.setMethodOfPay("Cash");
		jack.setSocSecNum("0504979");
		jack.introduce();
		jack.makePayment();
		sop();
		
		Customer guin = new Customer("Guin", "Ess", addys.get(1));
		guin.setAge(20);
		guin.setId("20831513");
		guin.setLevelOfEd("College");
		guin.setMethodOfPay("Debit");
		guin.setSocSecNum("58138135");
		guin.introduce("yes");
		guin.makePayment();
		sop();
		
		PartTimeHourly hen = new PartTimeHourly("Hen", "Essy", addys.get(2));
		hen.setAccomodations("None needed");
		hen.setAge(26);
		hen.setDeposit("Direct");
		hen.setId("3818519385");
		hen.setLevelOfEd("Masters");
		hen.setPay(22);
		hen.setSocSecNum("38383021");
		hen.introduce();
		sop(hen.computePay(15) + " for 15 hours");
		sop();
		
		PartTimeHourly sou = new PartTimeHourly("Sou", "Ju", addys.get(5));
		sou.setAccomodations("Shorter Desk");
		sou.setAge(51);
		sou.setDeposit("Cash");
		sou.setId("44430202");
		sou.setLevelOfEd("Bachelors");
		sou.setPay(33);
		sou.setSocSecNum("39499519");
		sou.introduce("no","yes");
		sop(sou.computePay(10) + " for 10 hours");
		sop();
		
		FullTimeHourlyEmp grey = new FullTimeHourlyEmp("Grey", "Goose", addys.get(3));
		grey.setAccomodations("Handicap Parking");
		grey.setAge(34);
		grey.setDeposit("Direct");
		grey.setId("135351d35");
		grey.setLevelOfEd("High School Graduate");
		grey.setOvertimePay(53);
		grey.setPay(40);
		grey.setSocSecNum("41851832512");
		grey.introduce();
		sop(grey.computePay(38) + "for 38 hours");
		sop(grey.computePay(40, 10) + " for 50 hours");
		sop();
		
		FullTimeHourlyEmp gin = new FullTimeHourlyEmp("Gin", "Tonic", addys.get(4));
		gin.setAccomodations("Everything");
		gin.setAge(30);
		gin.setDeposit("Cash");
		gin.setId("1949793");
		gin.setLevelOfEd("Middle School Graduate");
		gin.setOvertimePay(30);
		gin.setPay(15);
		gin.setSocSecNum("94978532");
		gin.introduce("yes", "yes");
		sop(gin.computePay(20) + " for 20 hours");
		sop(gin.computePay(40, 5)+ "for 45 hours");
		sop();
		
		HourlyPaidContractor stella = new HourlyPaidContractor("Stella", "Rosa", addys.get(6));
		stella.setAccomodations("None");
		stella.setAge(60);
		stella.setDeposit("Cash");
		stella.setId("98765353");
		stella.setLevelOfEd("High School");
		stella.setOvertimePay(70);
		stella.setPay(30);
		stella.setSocSecNum("789456123");
		stella.introduce("no", "yes");
		sop(stella.computePay(2) + " for 2 hours");
		sop(stella.computePay(40, 2) + " for 42 hours");
		sop();
		
		HourlyPaidContractor krak = new HourlyPaidContractor("Krak", "Ken", addys.get(7));
		krak.setAccomodations("Soundproof Room");
		krak.setAge(21);
		krak.setDeposit("Direct");
		krak.setId("188481024");
		krak.setLevelOfEd("None");
		krak.setOvertimePay(200);
		krak.setPay(100);
		krak.setSocSecNum("38475018");
		krak.introduce();
		sop(krak.computePay(40) + " for 40 hours");
		sop(krak.computePay(40, 2) + " for 42 hours");
		sop();
		
		Executive smir = new Executive("Smir", "Noff");
		smir.setAddy(addys.get(8));
		smir.setBonus(50000);
		smir.setAge(80);
		smir.setSocSecNum("68294819");
		smir.setLevelOfEd("Elementary School");
		smir.setDeposit("Direct");
		smir.setId("000001");
		smir.setAccomodations("None");
		smir.setSalary(2000000);
		smir.introduce();
		sop(smir.computePay() + "per year");
		sop();
		
		Executive tek = new Executive();
		tek.setFirst("Tek");
		tek.setLast("Keila");
		tek.setAddy(addys.get(9));
		tek.setBonus(100000);
		tek.setAge(22);
		tek.setSocSecNum("45682791");
		tek.setLevelOfEd("No School");
		tek.setAccomodations("Limosine Parking");
		tek.setDeposit("Direct");
		tek.setId("000000");
		tek.setSalary(100030000);
		tek.introduce();
		sop(tek.computePay() + " per year");
		sop();
		
		FullTimeSalariedEmp san = new FullTimeSalariedEmp("San", "Miguel", addys.get(10));
		san.setAge(24);
		san.setSocSecNum("38482084");
		san.setLevelOfEd("PHD");
		san.setAccomodations("None");
		san.setSalary(78949);
		san.setDeposit("Cash");
		san.setId("010303");
		san.introduce("Yes", "YES");
		sop(san.computePay(40) + " for 40 weeks.");
		sop();
		
		FullTimeSalariedEmp mike = new FullTimeSalariedEmp("Mike", "Lem", addys.get(11));
		mike.setAge(40);
		mike.setSocSecNum("875932");
		mike.setLevelOfEd("No Education");
		mike.setAccomodations("Handicapped Parking");
		mike.setSalary(45000);
		mike.setDeposit("Direct");
		mike.setId("102348");
		mike.introduce("no", "NO");
		sop(mike.computePay(52) + " for 52 weeks.");
		sop();
	}
	
}
