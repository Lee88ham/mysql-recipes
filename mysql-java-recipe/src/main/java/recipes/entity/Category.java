package recipes.entity;

public class Category {
private Integer categoryId;
private String categoryName;
public Integer getCategoryId() {
	return categoryId;
}
public void setCategoryId(Integer categoryId) {
	this.categoryId = categoryId;
}
@Override
public String toString() {
	return "ID=" + categoryId + ", categoryName=" + categoryName;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
}
