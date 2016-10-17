public class GetLatAndLngByBaidu { 
	private final double PI = 3.14159265358979323; //圆周率
    private final double R = 6371229;              //地球的半径
   
   
    public double getDistance(double longt1, double lat1, double longt2, double lat2){
        double x,y,distance;
        x=(longt2-longt1)*PI*R*Math.cos( ((lat1+lat2)/2) *PI/180)/180;
        y=(lat2-lat1)*PI*R/180;
        distance=Math.hypot(x,y);
        return distance;
    }
   
    public double getLongt(double longt1, double lat1, double distance){
        double a = (180*distance)/(PI*R*Math.cos(lat1*PI/180));
        return a;
    }
   
   
    public double getLat(double longt1, double lat1, double distance){
        double a = (180*distance)/(PI*R*Math.cos(lat1*PI/180));
        return a;
    }
   
    public static void main(String[] args){
    	GetLatAndLngByBaidu m = new GetLatAndLngByBaidu();
//        double s = m.getDistance(112.0235, 23.2563, 110.1235, 20.3563);
//        System.out.println(s);
       
        double longt = m.getLongt(112.0235, 23.2563, 10227.5985);
        System.out.println(longt);
       
        double lat = m.getLat(112.0235, 23.2563, 11131.9859);
        System.out.println(lat);
       
    }

}
