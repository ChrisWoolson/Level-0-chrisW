
void settings() {
  size(300,300); 
}
void draw(){
  for(int i=300;i>20; i=i-19){
  noFill();
if(i%2 == 1){
fill(255,0,0);
  ellipse(150,150 ,i,i);

}
  else{
fill(255,255,255);
    ellipse(150,150 ,i,i);

}
}
  
  
}