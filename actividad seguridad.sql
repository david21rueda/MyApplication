create view vista1 as 
Select libro.id_libro, libro.titulo, edicion.isbn, prestamo.fecha_pres, prestamo.fecha_dev
from libro, edicion, prestamo,tiene,copia
where libro.id_libro=tiene.id_libro_fk and
	tiene.isbn_edicion_fk=edicion.isbn and
	edicion.isbn=copia.isbn_fk and
	copia.isbn_fk=prestamo.isbn_copia_fk;
	
create role lectores;
grant select on libro to lectores;
create role bibliotecario;
grant all PRIVILEGES on libro,edicion,prestamo,tiene,copia,autor, autorea, usuario to bibliotecario;


create user angie password 'dayanna';
grant bibliotecario to angie;

