package entities;

public class Expense { private double expense;
    private int month;
    private int year;
    
    public Expense(Double expense, int month, int year) {
		this.expense = expense;
		this.month = month;
		this.year = year;
	}
    
    public double getexpense() {
		return expense;
	}

	public void setexpense(double expense) {
		this.expense = expense;
	}

    public int getmonth() {
		return month;
	}

	public void setmonth(int month) {
		this.month = month;
	}

    public int getyear() {
		return year;
	}

	public void setyear(int year) {
		this.year = year;
	}

}

}
