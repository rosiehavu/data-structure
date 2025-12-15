package data_structure;

public class PlaneSeatReservation {
	
	public static int findMaxSeatsForThree(int N, String S) {
		
		if (S == null || S.isEmpty()) {
			return N * 3; 
		}
		
		int[][] seatMap = new int[N][10];
		
		String[] occupiedSeats = S.split(" ");
		
		for (String seat : occupiedSeats) {
			int row = Integer.parseInt(seat.substring(0, seat.length() -1)) - 1;
			int column = seat.charAt(seat.length() - 1) - 'A';
			seatMap[row][column] = 1;
		}
		
		int possibleSeats = 0;
		
		for(int i = 0; i < N; i++) {
			
			if (seatMap[i][0] == 0 && seatMap[i][1] == 0 && seatMap[i][2] == 0) {
				possibleSeats++; 
			} 
				
			if (seatMap[i][3] == 0 && seatMap[i][4] == 0 && seatMap[i][5] == 0) {
				possibleSeats++; 
			} else if (seatMap[i][4] == 0 && seatMap[i][5] == 0 && seatMap[i][6] == 0) {
				possibleSeats++; 
			} 
			if (seatMap[i][7] == 0 && seatMap[i][8] == 0 && seatMap[i][9] == 0) {
				possibleSeats++; 
			}
		}
		
		return possibleSeats;
	}
	
	public static void main(String[] args) {
		int N1 = 2;
		String S1 = "1A 2F 1C";
		System.out.println(findMaxSeatsForThree(N1, S1)); 
	}

}
