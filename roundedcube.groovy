//create a rounded cube
CSG roundedCube = new RoundedCube(	90,// X dimention
				80,// Y dimention
				70//  Z dimention
				)
				.cornerRadius(4)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
return roundedCube