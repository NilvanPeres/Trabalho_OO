package entities;

public class SubCategory extends Category{

	private String subCategoryName;
	
	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	
    @Override //polimorfismo (?)
    public String toString() {
        return "SubCategory [subCategoryName=" + subCategoryName +"" +super.toString()+ "]";
    }
	
}
