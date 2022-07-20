class Solution {
    
    
    enum Directions{
        North, South, East, West
    }
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0;
        Directions dir = Directions.North;
        
        for(char c : instructions.toCharArray()){
            
            if(c == 'G'){
                switch(dir){
                        case North:
                        y++;
                        break;
                        
                    case South:
                        y--;
                        break;
                        
                    case East:
                        x--;
                        break;
                        
                    case West:
                        x++;
                        break;
                }
                
            }
            
            if(c == 'L'){
                switch(dir){
                        case North:
                        dir = Directions.East;
                        break;
                        
                    case South:
                        dir = Directions.West;
                        break;
                        
                    case East:
                        dir = Directions.South;
                        break;
                        
                    case West:
                        dir = Directions.North;
                        break;
                }
            }
            
                        if(c == 'R'){
                switch(dir){
                        case North:
                        dir = Directions.West;
                        break;
                        
                    case South:
                        dir = Directions.East;
                        break;
                        
                    case East:
                        dir = Directions.North;
                        break;
                        
                    case West:
                        dir = Directions.South;
                        break;
                }
            }
            
            
            
        }
        
        if(x == 0 && y == 0)
            return true;
        if(dir == Directions.North)
            return false;
        
        return true;
        
    }
}