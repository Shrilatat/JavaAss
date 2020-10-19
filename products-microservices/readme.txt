It contains 3 separate microservices : product-catalog, product-category, product-managenent

product-management is the face of the project, user will only access this controller and this controller is going to internally call the other two and 
will show these responses to the user

product-category has a in-memory h2 database, which has a table 'categories' having single column 'category' having 5 values 'laptop','mobile','tv',etc
when management controller requests for the '\categories' , dao of this controller triggers a sql query and sends back the list of categories
to the management controller as a response

product-catalog has a in-memory h2 database, which has a table 'products' having attributes 'name','descp','price','category'
when management controller requests for the '\categories\{category}' i.e. for a specific category , dao of this controller triggers a sql query
having the category and sends back the list of filtered products which only belong to that particular category and sends this list to
to the management controller as a response

