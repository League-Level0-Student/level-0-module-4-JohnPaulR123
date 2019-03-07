 PImage face; 
 int x;
 int y;
void setup(){
   face = loadImage("Patrick_Star.jpg");  
size(400,400);
face.resize(400,400);
background(face);
}

void draw(){
  x=mouseX;
  y=mouseY;
  background(face);
   fill(255,255,255);
 ellipse(162,137,100,100);
 ellipse(246,141,100,100);
fill(0,0,0);
if(x>228){
x=228;
}
if(x<185){
  x=185;
}
if(y>180){
 y=180; 
}
if (y<98){
y=98;
}
 ellipse(x+42,y,10,10); //right pupil
  ellipse(x-42,y,10,10);//left eye
if(mousePressed){
 println(mouseY);
 //println(mouseX);
}}
//left pupil x=135 y=151
//x=162 y= 137 left eye
//right pupil x=243 y=165
//x=246 y=141right eye