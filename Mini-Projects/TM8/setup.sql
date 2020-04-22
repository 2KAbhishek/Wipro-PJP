DROP TABLE TBL_SALES;
DROP TABLE TBL_STOCK;
CREATE TABLE TBL_STOCK (
    Product_ID Varchar2(6),
    Product_Name Varchar2(20),
    Quantity_On_Hand Number(11),
    Product_Unit_Price Number(11,2),
    Reorder_Level Number(11),
    CONSTRAINT PK00 PRIMARY KEY(Product_ID),
    CONSTRAINT UQ01 UNIQUE(Product_Name),
    CONSTRAINT CH02 CHECK(Quantity_On_Hand >= 0),
    CONSTRAINT CH03 CHECK(Product_Unit_Price >= 0),
    CONSTRAINT CH04 CHECK(Reorder_Level >= 0)
);

CREATE TABLE TBL_SALES (
    Sales_ID Varchar2(6),
    Sales_Date Date,
    Product_ID Varchar2(6),
    Quantity_Sold Number(11),
    Sales_Price_Per_Unit Number(11,2),
    CONSTRAINT PK10 PRIMARY KEY(Sales_ID),
    CONSTRAINT FK11 FOREIGN KEY(Product_ID) REFERENCES TBL_STOCK(Product_ID),
    CONSTRAINT CH12 CHECK(Quantity_Sold >= 0),
    CONSTRAINT CH13 CHECK(Sales_Price_Per_Unit >= 0)
);

INSERT INTO TBL_STOCK VALUES('RE1001', 'REDMI Note 3', 20, 12000, 5);
INSERT INTO TBL_STOCK VALUES('ip1002', 'Iphone 5S', 10, 21000, 2);
INSERT INTO TBL_STOCK VALUES('PA1003', 'Panasonic P55', 50, 5500, 5);

DROP SEQUENCE SEQ_SALES_ID;
DROP SEQUENCE SEQ_PRODUCT_ID;
CREATE SEQUENCE SEQ_SALES_ID START WITH 1000 INCREMENT BY 1;
CREATE SEQUENCE SEQ_PRODUCT_ID START WITH 1004 INCREMENT BY 1;

DROP VIEW V_SALES_REPORT;
CREATE VIEW V_SALES_REPORT AS
    SELECT Sales_ID, Sales_Date, Product_ID, Product_Name, 
            Quantity_Sold, Product_Unit_Price, Sales_Price_Per_Unit, 
            (Sales_Price_Per_Unit - Product_Unit_Price) Profit_Amount
    FROM TBL_STOCK NATURAL JOIN TBL_SALES
    ORDER BY Profit_Amount DESC, Sales_ID ASC;

