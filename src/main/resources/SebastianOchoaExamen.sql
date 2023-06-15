/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     6/14/2023 8:02:16 PM                         */
/*==============================================================*/


drop table PERFIL;

drop index IDX_USR_NAME;

drop table USUARIO;

drop table USUARIO_PERFIL;

/*==============================================================*/
/* Table: PERFIL                                                */
/*==============================================================*/
create table PERFIL (
   COD_PERFIL           VARCHAR(8)           not null,
   NOMBRE               VARCHAR(100)         not null,
   VERSION              INT4                 not null,
   constraint PK_PERFIL primary key (COD_PERFIL)
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO (
   COD_USUARIO          SERIAL not null,
   MAIL                 VARCHAR(128)         not null,
   CLAVE                VARCHAR(64)          not null,
   NOMBRE               VARCHAR(128)         not null,
   INTENTOS_FALLIDOS    NUMERIC(8)           null,
   SUELDO               NUMERIC(8,2)         null,
   FECHA_NACIMIENTO     DATE                 not null,
   VERSION              INT4                 not null,
   constraint PK_USUARIO primary key (COD_USUARIO)
);

/*==============================================================*/
/* Index: IDX_USR_NAME                                          */
/*==============================================================*/
create unique index IDX_USR_NAME on USUARIO (
MAIL,
NOMBRE,
COD_USUARIO
);

/*==============================================================*/
/* Table: USUARIO_PERFIL                                        */
/*==============================================================*/
create table USUARIO_PERFIL (
   COD_USUARIO          INT4                 not null,
   COD_PERFIL           VARCHAR(8)           not null,
   FECHA_CREACION       TIMESTAMP            not null,
   ES_ACTIVO            BOOL                 not null,
   VERSION              INT4                 not null,
   constraint PK_USUARIO_PERFIL primary key (COD_USUARIO, COD_PERFIL)
);

alter table USUARIO_PERFIL
   add constraint FK_USUARIO__USRPR_TO__PERFIL foreign key (COD_PERFIL)
      references PERFIL (COD_PERFIL)
      on delete restrict on update restrict;

alter table USUARIO_PERFIL
   add constraint FK_USUARIO__USRPR_TO__USUARIO foreign key (COD_USUARIO)
      references USUARIO (COD_USUARIO)
      on delete restrict on update restrict;

