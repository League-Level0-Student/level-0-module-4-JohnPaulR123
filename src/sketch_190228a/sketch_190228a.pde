void setup(){
  PImage face = loadImage("Patrick_Star.jpg");  
size(400,400);
face.resize(400,400);
background(face);
}

void draw(){
   fill(255,255,255);
 ellipse(162,137,100,100);
 ellipse(246,141,100,100);
fill(0,0,0);
 ellipse(mouseX + 135,mouseY + 151,10,10);
  ellipse(243,165,10,10);
//if(mousePressed){
 //print(mouseY);
 //print(mouseX);
}
//left pupil x=135 y=151
//x=162 y= 137 left eye
//right pupil x=243 y=165
//x=246 y=141right eye