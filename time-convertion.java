String s = in.next();
String period = s.substring(s.length()-2);
int time = Integer.parseInt(s.substring(0,2));

if(period.equals("AM")) {
    if(time == 12) time = 0;
} else {
    if(time < 12) time += 12;
}

System.out.printf("%02d%s", time, s.substring(2, s.length()-2));
