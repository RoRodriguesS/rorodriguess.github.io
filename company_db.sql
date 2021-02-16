/*	The SQL code bellow was achieved as result of classes taught by prof. Isidro during his course "Modern Web Development".
	More info about the course and prof. Isidro as well can be found at: https://www.hotmart.com/product/modern-web-development/V44878327M
*/
/* Data Definition Commands*/

CREATE DATABASE company_db;

USE company_db;

CREATE TABLE department (
	id 				integer not null primary key,
    dpt_name		varchar(100)  not null ,
    dpt_floor 		integer not null
);

CREATE TABLE project (
	id 			integer not null auto_increment primary key,
    description	varchar(500) not null
);

CREATE TABLE employee (
	id			integer not null auto_increment primary key,
    emp_name	varchar(100) not null,
    salary		double not null,
    dpt_id		integer,
    emp_id		integer,
    
    constraint fk_dpt FOREIGN KEY (dpt_id) REFERENCES department(id),
    constraint fk_emp FOREIGN KEY (emp_id) REFERENCES employee(id)
);

CREATE TABLE participates (
	contract	integer not null auto_increment primary key,
    start_date	date not null,
    end_date	date not null,
    emp_id		integer,
    proj_id		integer,
    
    constraint fk_emp FOREIGN KEY (emp_id) REFERENCES employee(id),
    constraint fk_proj FOREIGN KEY (proj_id) REFERENCES project(id)
);

/* Data Manipulation Commands. */

INSERT INTO department (id, dpt_name, dpt_floor) VALUES (1, "Corporate Office", 6);
INSERT INTO department (id, dpt_name, dpt_floor) VALUES (2, "Management", 5);
INSERT INTO department (id, dpt_name, dpt_floor) VALUES (3, "Technology", 3);
INSERT INTO department (id, dpt_name, dpt_floor) VALUES (4, "Services", 2);

INSERT INTO project (id, description) VALUES (NULL, "CRM implamentation");
INSERT INTO project (id, description) VALUES (NULL, "Website implamantation");
INSERT INTO project (id, description) VALUES (NULL, "APP implemantation");

INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Rodrigo Rodrigues", 20000, 1, null);
INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Pedro Rodrigues", 15000, 1, 1);
INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Jason Rafael", 10000, 2, 2);
INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Vitor Sabara", 10000, 4, 2);
INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Welber Clayton", 4000, 4, 4);
INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Anderson Froes", 6000, 3, 3);
INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Allan Froes", 6000, 3, 3);
INSERT INTO employee (id, emp_name, salary, dpt_id, emp_id) VALUES (null, "Orlando Augusto", 6000, 3, 3);

INSERT INTO participates (contract, start_date, end_date, emp_id, proj_id) VALUES (null, '2021-03-01', '2021-03-30', 3, 1);
INSERT INTO participates (contract, start_date, end_date, emp_id, proj_id) VALUES (null, '2021-03-01', '2021-03-30', 2, 2);
INSERT INTO participates (contract, start_date, end_date, emp_id, proj_id) VALUES (null, '2021-03-01', '2021-03-30', 1, 1);

