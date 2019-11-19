# InventoryAPI
Product Inventory

This is an Inventory API that can Update, Delete, Add and Fetch products.</br>
CRUD opertations performed using Hibernate/JPA</br>
IDLE : Spring Tool Suite 4</br>
Database : H2

<b>Inside of the Files</b>

Product class : Contains POJO's - "pid", "pname","description","stock"

productDao interface : The interface implements JpaRepository<"table name", "ID datatype">

ProductController class : The productController has all the methods for performing the functions :-

*GetMapping("product/{id}") - to find product based on ID</br>
*GetMapping("products") - to fetch all the products</br>
*PostMapping("addproduct") - to add a product </br>
*PutMapping("updateproduct") - to update an product</br>
*DeleteMapping("deleteproduct/{id}") - to delete an particular product
