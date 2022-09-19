class SportsRunner{
	public static void main(String[] games){
		String[] ref1={"Virat Kohli","Suyash Prabhudessai","Rajat patidar","Mohamad Siraj","Siddarth kaul","Karn Sharma",
		"Harshal Patel","Finnallen","Anuj rawat","Akash deep"};
		Sports.cricketTeamMembers(ref1);
		
		int[] ref2={7,6,8,9,13,4,5,3,2,1};
		Sports.kabbadiTeamMembersIerseyNos(ref2);
		
		double[] ref3={120000d,220000d,350000d,340000d,450000d,390000d,400000d,560000d,540000d,600000d};
		Sports.footBallTeamMembersSalary(ref3);
		
		long[] ref4={9535230930l,9835230930l,9567230930l,9535237644l,9535675430l,9535234330l,6364230930l,9598760930l,9535236534l,9535278650l};
		Sports.ludoTeamMobileNo(ref4);
		
		int[] ref5={10,12,12,8,9,7,11,13,14,15};
		Sports.hockeyTeamMembersNoOfMatches(ref5);
		
		long[] ref6={91,91,91,91,91,91,91,91,91};
		Sports.kokoTeamMembersCountryCode(ref6);
		
		boolean[] ref7={true,true,true,true,true,true,true,true,true,true};
		Sports.lagoriTeamMembersAlive(ref7);
	}
}