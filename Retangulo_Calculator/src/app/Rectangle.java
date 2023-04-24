package app;

public class Rectangle {
	
	private Double Width;	
	private Double Height; 
	
	public Rectangle(Double width, Double height) {
		Width = width;
		Height = height;
	}
	
	public Double Area() {
		
		Double areaTotal = this.Width * this.Height;
		return areaTotal;
		
	}
	
	public Double Perimeter() {
		
		Double perimeter = 2*(this.Width + this.Height);
		return perimeter;
		
	}
	
	public Double Diagonal() {
		
		Double diagonalInicial = (this.Height*this.Height)+(this.Width*this.Width);
		Double diagonalFinal = Math.sqrt(diagonalInicial);
		
		return diagonalFinal;
	}

	@Override
	public String toString() {
		return "Valor da Area: " + Area() 
		+ "\nValor do Perímetro: " + Perimeter()
		+ "\nValor da Diagonal: " + Diagonal();
	}
	
		
	
}
