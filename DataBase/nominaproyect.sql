create database nominaproyect;
use nominaproyect;

create table Puestos
(
Codigo_Puesto varchar(5) primary key,
Nombre_Puesto varchar(60) not null,
Estado_Puesto varchar(1) not null
)engine=InnoDB;

create table Departamentos
(
Codigo_Departamento varchar(5) primary key,
Nombre_Departamento varchar(60) not null,
Estado_Departamento varchar(1) not null
)engine=InnoDB;

create table Empleados
(
Codigo_Empleado varchar(5) primary key,
Nombre_Empleado varchar(60) not null,
Codigo_Puesto varchar(5) not null,
Codigo_Departamento varchar(5) not null,
Sueldo_Empleado float(10),
Estado_Empledo varchar(1) not null,

foreign key (Codigo_Puesto) references
Puestos(Codigo_Puesto),
foreign key (Codigo_Departamento) references
Departamentos(Codigo_Departamento)
)engine=InnoDB;

create table Conceptos
(
Codigo_Concepto varchar(5) primary key,
Nombre_Concepto varchar(60) not null,
Efecto_Concepto varchar(1) not null,
Estatus_Concepto varchar(1) not null
)engine=InnoDB;

create table NominaEncabezado
(
Codigo_Nomina varchar(5) primary key,
Fecha_Inicial_Nomina date,
Fecha_Final_Nomina date
)engine=InnoDB;

create table NominaDescripcion
(
Codigo_Nomina varchar(5) not null,
Codigo_Empleado varchar(5) not null,
Codigo_Concepto varchar(5) not null,
Valor_NominaD float(10),

foreign key (Codigo_Nomina) references
NominaEncabezado(Codigo_Nomina),
foreign key (Codigo_Empleado) references
Empleados(Codigo_Empleado),
foreign key (Codigo_Concepto) references
Conceptos(Codigo_Concepto)
)engine=InnoDB;

drop database nominaproyect;