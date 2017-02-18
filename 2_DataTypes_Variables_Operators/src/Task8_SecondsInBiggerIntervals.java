public class Task8_SecondsInBiggerIntervals {

    public static void main(String[] args) {

        final byte secPerMin = 60;
        final short secPerHour = secPerMin * 60;
        final int secPerDay = secPerHour * 24;
        int seconds = 1234567;

        int days = seconds / secPerDay;
        seconds = seconds - days*secPerDay;  
        int hours = seconds /secPerHour;
        seconds = seconds - hours*secPerHour;  
        int mins = seconds / secPerMin;
        seconds = seconds - mins*secPerMin;  
        
        System.out.println(days + " days," + hours + " hours," + mins + " mins," + seconds + " seconds");
        
        seconds = 1234567;
        
        System.out.println(seconds/secPerDay + " days," + seconds%secPerDay/secPerHour + " hours," + 
                seconds%secPerDay%secPerHour/secPerMin + " mins," + seconds%secPerDay%secPerHour%secPerMin + " seconds");
        
        seconds = 3600;
        
        days = seconds / secPerDay;
        seconds = seconds - days*secPerDay;  
        hours = seconds /secPerHour;
        seconds = seconds - hours*secPerHour;  
        mins = seconds / secPerMin;
        seconds = seconds - mins*secPerMin;  
        
        System.out.println(days + " days," + hours + " hours," + mins + " mins," + seconds + " seconds");
        
        seconds = 3600;
        
        System.out.println(seconds/secPerDay + " days," + seconds%secPerDay/secPerHour + " hours," + 
                seconds%secPerDay%secPerHour/secPerMin + " mins," + seconds%secPerDay%secPerHour%secPerMin + " seconds");
                
        seconds = 129600;
        
        days = seconds / secPerDay;
        seconds = seconds - days*secPerDay;  
        hours = seconds /secPerHour;
        seconds = seconds - hours*secPerHour;  
        mins = seconds / secPerMin;
        seconds = seconds - mins*secPerMin;  
        
        System.out.println(days + " days," + hours + " hours," + mins + " mins," + seconds + " seconds");
        
        seconds = 129600;
        
        System.out.println(seconds/secPerDay + " days," + seconds%secPerDay/secPerHour + " hours," + 
                seconds%secPerDay%secPerHour/secPerMin + " mins," + seconds%secPerDay%secPerHour%secPerMin + " seconds");
        
    }

}