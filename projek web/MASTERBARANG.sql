--------------------------------------------------------
--  File created - Senin-Mei-21-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MASTERBARANG
--------------------------------------------------------

  CREATE TABLE "GANTENG"."MASTERBARANG" 
   (	"KODEBARANG" VARCHAR2(20 BYTE), 
	"NAMABARANG" VARCHAR2(20 BYTE), 
	"HARGAJUAL" VARCHAR2(20 BYTE), 
	"HARGABELI" VARCHAR2(20 BYTE), 
	"SATUAN" VARCHAR2(20 BYTE), 
	"KATEGORI" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
