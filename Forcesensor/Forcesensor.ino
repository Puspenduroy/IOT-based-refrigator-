#include <ESP8266WiFi.h>                 
#include <FirebaseArduino.h>                    
#define FIREBASE_HOST "hospital-45085-default-rtdb.firebaseio.com"      
#define FIREBASE_AUTH "izYUnFvjs0BEiK4zJxrkPHkMDOdxThGObCHWsoWN"            
#define WIFI_SSID "vivo 1718"                                  
#define WIFI_PASSWORD "santasreeroy@25"            
int forceReading;
int forcePin = A0;
void setup() 
{
  Serial.begin(115200);
                                                   //reads dht sensor data 
               
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);                                  
  Serial.print("Connecting to ");
  Serial.print(WIFI_SSID);
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }
 
  Serial.println();
  Serial.print("Connected");
  Serial.print("IP Address: ");
  Serial.println(WiFi.localIP());                               
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);                 
 
}
void loop() 
{
  forceReading = analogRead(forcePin);
  
  
  Serial.print("force");  
  Serial.print(forceReading);
  String fireHumid = String(forceReading);                   
  delay(5000);           
  Firebase.setString ("/Users/preassure/firstName",fireHumid);
  if (Firebase.failed()) 
    {
 
      Serial.print("pushing /logs failed:");
      Serial.println(Firebase.error()); 
      return;
}
}
