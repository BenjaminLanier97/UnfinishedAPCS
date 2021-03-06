private boolean solve(boolean animate, int mode){

		Frontier rest = new Frontier(mode);
		Point start = new Point(startx,starty);//startx and starty are instance variables in my maze class

		rest.add(start);//put the start into the Frontier 
		
		boolean solved = false;
		while(!solved && rest.hasNext()){
				if(animate && !solved){
						System.out.println(toString(true));
				}
				//get the top
				Point next = rest.remove();
				//check if solved
				if(maze[next.getX()][next.getY()]=='E'){
						//solved!
						solved = true;
						addCoordinatesToSolutionArray(next);

													//my point class has a reference to previous points, so the solution will be determined from the final point

				}else{
						//not solved, so add neighbors to Frontier and mark the floor with x.
						maze[next.getX()][next.getY()]='x';
						for(Point p : getNeighbors(next)){
								rest.add(p);
						}

				}
		}
		return solved;
}
