--------------------------------------------------------
--  File created - Senin-Mei-21-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PENJUALAN
--------------------------------------------------------

  CREATE TABLE "GANTENG"."PENJUALAN" 
   (	"TGLFAKTUR" VARCHAR2(20 BYTE), 
	"NOFAKTUR" VARCHAR2(20 BYTE), 
	"NAMAKONSUMEN" VARCHAR2(20 BYTE), 
	"KODE" VARCHAR2(20 BYTE), 
	"JUMLAH" NUMBER(*,0), 
	"HARGASATUAN" NUMBER(*,0), 
	"HARGATOTAL" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
