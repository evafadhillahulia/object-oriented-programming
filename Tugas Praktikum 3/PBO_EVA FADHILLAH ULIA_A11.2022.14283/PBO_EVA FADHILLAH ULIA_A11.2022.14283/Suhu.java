class Suhu {
    double celcius;

 double Kelvin(){
     return celcius + 273.15;
 }
 double Fahrenheit(){
     return celcius * 1.8 + 32;
 }
 double Rankine(){
     return celcius * 1.8 + 491.67;
 }
 double Delisle(){
     return (100 - celcius) * 1.5;
 }
 double Newton(){
    return celcius * 33/100;
 }
 double Reamur(){
     return celcius * 0.8;
 }
 double Romer(){
     return  celcius * 21/40 + 7.5;
 }
}