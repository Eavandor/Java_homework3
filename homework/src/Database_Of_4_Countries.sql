-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: depstore
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `situation_of_areas`
--

DROP TABLE IF EXISTS `situation_of_areas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `situation_of_areas` (
  `nation` varchar(20) DEFAULT NULL,
  `lat` varchar(20) DEFAULT NULL,
  `length` varchar(20) DEFAULT NULL,
  `confirmed` int DEFAULT NULL,
  `recovered` int DEFAULT NULL,
  `deaths` int DEFAULT NULL,
  `updateTime` varchar(40) DEFAULT NULL,
  `nameOfArea` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `situation_of_areas`
--

LOCK TABLES `situation_of_areas` WRITE;
/*!40000 ALTER TABLE `situation_of_areas` DISABLE KEYS */;
INSERT INTO `situation_of_areas` VALUES ('China','35.7518','104.2861',182,180,2,'2020/12/24 11:22:29+00','Gansu'),('China','22.3','114.2',8353,7112,133,'2020/12/24 11:22:29+00','Hong Kong'),('China','31.8257','117.2264',992,986,6,'2020/12/24 11:22:29+00','Anhui'),('China','27.614','115.7221',935,934,1,'2020/12/24 11:22:29+00','Jiangxi'),('China','22.1667','113.55',46,46,0,'2020/12/24 11:22:29+00','Macau'),('China','35.1917','108.8701',504,487,3,'2020/12/24 11:22:29+00','Shaanxi'),('China','31.6927','88.0924',1,1,0,'2020/12/24 11:22:29+00','Tibet'),('China','26.0789','117.9874',507,485,1,'2020/12/24 11:22:29+00','Fujian'),('China','19.1959','109.7453',171,165,6,'2020/12/24 11:22:29+00','Hainan'),('China','39.3054','117.323',304,298,3,'2020/12/24 11:22:29+00','Tianjin'),('China','41.1129','85.2401',980,977,3,'2020/12/24 11:22:29+00','Xinjiang'),('China','30.6171','102.7103',845,806,3,'2020/12/24 11:22:29+00','Sichuan'),('China','30.9756','112.2707',68149,63637,4512,'2020/12/24 11:22:29+00','Hubei'),('China','43.6661','126.1923',157,155,2,'2020/12/24 11:22:29+00','Jilin'),('China','29.1832','120.0934',1300,1290,1,'2020/12/24 11:22:29+00','Zhejiang'),('China','30.0572','107.874',590,584,6,'2020/12/24 11:22:29+00','Chongqing'),('China','47.862','127.7615',961,937,13,'2020/12/24 11:22:29+00','Heilongjiang'),('China','37.5777','112.2922',224,221,0,'2020/12/24 11:22:29+00','Shanxi'),('China','23.3417','113.4244',2036,1993,8,'2020/12/24 11:22:29+00','Guangdong'),('China','41.2956','122.6085',302,287,2,'2020/12/24 11:22:29+00','Liaoning'),('China','27.6104','111.7088',1020,1016,4,'2020/12/24 11:22:29+00','Hunan'),('China','44.0935','113.9448',352,335,1,'2020/12/24 11:22:29+00','Inner Mongolia'),('China','31.202','121.4491',1479,1362,7,'2020/12/24 11:22:29+00','Shanghai'),('China','36.3427','118.1498',861,841,7,'2020/12/24 11:22:29+00','Shandong'),('China','24.974','101.487',227,213,2,'2020/12/24 11:22:29+00','Yunnan'),('China','26.8154','106.8748',147,145,2,'2020/12/24 11:22:29+00','Guizhou'),('China','37.2692','106.1655',75,75,0,'2020/12/24 11:22:29+00','Ningxia'),('China','37.8957','114.9042',373,367,6,'2020/12/24 11:22:29+00','Hebei'),('China','40.1824','116.4142',961,941,9,'2020/12/24 11:22:29+00','Beijing'),('China','23.8298','108.7881',264,261,2,'2020/12/24 11:22:29+00','Guangxi'),('China','33.882','113.614',1298,1270,22,'2020/12/24 11:22:29+00','Henan'),('China','32.9711','119.455',684,679,0,'2020/12/24 11:22:29+00','Jiangsu'),('China','35.7452','95.9956',18,18,0,'2020/12/24 11:22:29+00','Qinghai'),('US','0','0',0,0,0,'2020/12/24 11:22:29+00','Recovered'),('US','35.630066','-79.806419',494511,0,6360,'2020/12/24 11:22:29+00','North Carolina'),('US','39.849426','-86.258278',476538,0,7645,'2020/12/24 11:22:29+00','Indiana'),('US','42.755966','-107.30249',42664,0,373,'2020/12/24 11:22:29+00','Wyoming'),('US','15.0979','145.6739',118,0,2,'2020/12/24 11:22:29+00','Northern Mariana Islands'),('US','40.150032','-111.862434',257697,0,1196,'2020/12/24 11:22:29+00','Utah'),('US','13.4443','144.7937',7266,0,121,'2020/12/24 11:22:29+00','Guam'),('US','35.4437','139.638',49,0,0,'2020/08/04 02:27:56+00','Diamond Princess'),('US','33.729759','-111.431221',473273,0,8179,'2020/12/24 11:22:29+00','Arizona'),('US','46.921925','-110.454353',78522,0,914,'2020/12/24 11:22:29+00','Montana'),('US','18.3358','-64.8963',1967,0,23,'2020/12/24 11:22:29+00','Virgin Islands'),('US','37.66814','-84.670067',250279,0,2466,'2020/12/24 11:22:29+00','Kentucky'),('US','38.5266','-96.726486',212852,0,2493,'2020/12/24 11:22:29+00','Kansas'),('US','36.116203','-119.681564',2010004,0,23651,'2020/12/24 11:22:29+00','California'),('US','39.318523','-75.507141',52235,0,872,'2020/12/24 11:22:29+00','Delaware'),('US','27.766279','-81.686783',1234399,0,20874,'2020/12/24 11:22:29+00','Florida'),('US','40.590752','-77.209755',586474,0,14440,'2020/12/24 11:22:29+00','Pennsylvania'),('US','32.741646','-89.678696',200325,0,4533,'2020/12/24 11:22:29+00','Mississippi'),('US','42.011539','-93.210526',272114,0,3667,'2020/12/24 11:22:29+00','Iowa'),('US','40.349457','-88.986137',918070,0,16842,'2020/12/24 11:22:29+00','Illinois'),('US','31.054487','-97.563461',1648569,0,26406,'2020/12/24 11:22:29+00','Texas'),('US','41.597782','-72.755371',170705,0,5736,'2020/12/24 11:22:29+00','Connecticut'),('US','33.040619','-83.643074',608290,0,10519,'2020/12/24 11:22:29+00','Georgia'),('US','39.063946','-76.802101',257862,0,5568,'2020/12/24 11:22:29+00','Maryland'),('US','37.769337','-78.169968',319133,0,4760,'2020/12/24 11:22:29+00','Virginia'),('US','44.240459','-114.478828',133985,0,1324,'2020/12/24 11:22:29+00','Idaho'),('US','44.572021','-122.070938',105970,0,1403,'2020/12/24 11:22:29+00','Oregon'),('US','44.045876','-72.710686',6680,0,117,'2020/12/24 11:22:29+00','Vermont'),('US','37.64894','-122.665479',103,0,3,'2020/08/04 02:27:56+00','Grand Princess'),('US','18.2208','-66.5901',70808,0,1423,'2020/12/24 11:22:29+00','Puerto Rico'),('US','35.565342','-96.928917',269276,0,2283,'2020/12/24 11:22:29+00','Oklahoma'),('US','35.747845','-86.692345',541240,0,6380,'2020/12/24 11:22:29+00','Tennessee'),('US','44.693947','-69.381927',20491,0,311,'2020/12/24 11:22:29+00','Maine'),('US','-14.271','-170.132',0,0,0,'1970/01/01 00:00:00+00','American Samoa'),('US','32.3182','-86.9023',334569,0,4587,'2020/12/24 11:22:29+00','Alabama'),('US','34.969704','-92.373123',207941,0,3376,'2020/12/24 11:22:29+00','Arkansas'),('US','47.400902','-121.490494',230202,0,3162,'2020/12/24 11:22:29+00','Washington'),('US','33.856892','-80.945007',282230,0,5028,'2020/12/24 11:22:29+00','South Carolina'),('US','41.12537','-98.268082',159662,0,1561,'2020/12/24 11:22:29+00','Nebraska'),('US','38.491226','-80.954453',75936,0,1194,'2020/12/24 11:22:29+00','West Virginia'),('US','39.059811','-105.311104',316500,0,4462,'2020/12/24 11:22:29+00','Colorado'),('US','42.230171','-71.530106',335988,0,11887,'2020/12/24 11:22:29+00','Massachusetts'),('US','38.456085','-92.288368',383261,0,5406,'2020/12/24 11:22:29+00','Missouri'),('US','61.370716','-152.404419',44828,0,197,'2020/12/24 11:22:29+00','Alaska'),('US','18.35','-64.933',0,0,0,'1970/01/01 00:00:00+00','United States Virgin Islands'),('US','47.528912','-99.784012',90722,0,1243,'2020/12/24 11:22:29+00','North Dakota'),('US','44.268543','-89.616508',500443,0,4953,'2020/12/24 11:22:29+00','Wisconsin'),('US','38.313515','-117.055374',209962,0,2869,'2020/12/24 11:22:29+00','Nevada'),('US','42.165726','-74.948051',878702,0,36876,'2020/12/24 11:22:29+00','New York'),('US','41.680893','-71.51178',82066,0,1704,'2020/12/24 11:22:29+00','Rhode Island'),('US','38.897438','-77.026817',27226,0,751,'2020/12/24 11:22:29+00','District of Columbia'),('US','44.299782','-99.438828',96040,0,1389,'2020/12/24 11:22:29+00','South Dakota'),('US','21.094318','-157.498337',20868,0,285,'2020/12/24 11:22:29+00','Hawaii'),('US','45.694454','-93.900192',402519,0,5030,'2020/12/24 11:22:29+00','Minnesota'),('US','40.298904','-74.521011',445138,0,18466,'2020/12/24 11:22:29+00','New Jersey'),('US','43.326618','-84.536095',508449,0,12415,'2020/12/24 11:22:29+00','Michigan'),('US','34.840515','-106.248482',133242,0,2243,'2020/12/24 11:22:29+00','New Mexico'),('US','43.452492','-71.563896',38512,0,677,'2020/12/24 11:22:29+00','New Hampshire'),('US','31.169546','-91.867805',293934,0,7226,'2020/12/24 11:22:29+00','Louisiana'),('US','40.388783','-82.764915',644822,0,8361,'2020/12/24 11:22:29+00','Ohio'),('Japan','32.608154','130.745231',1545,1256,17,'2020/12/24 11:22:29+00','Kumamoto'),('Japan','35.612364','138.611489',505,444,9,'2020/12/24 11:22:29+00','Yamanashi'),('Japan','35.253815','135.443341',4105,3163,42,'2020/12/24 11:22:29+00','Kyoto'),('Japan','38.448396','140.102154',345,233,3,'2020/12/24 11:22:29+00','Yamagata'),('Japan','','',8,8,0,'2020/12/24 11:22:29+00','Unknown'),('Japan','35.711343','139.446921',54086,46525,552,'2020/12/24 11:22:29+00','Tokyo'),('Japan','34.217292','133.969047',258,186,3,'2020/12/24 11:22:29+00','Kagawa'),('Japan','35.035551','137.211621',14935,12072,160,'2020/12/24 11:22:29+00','Aichi'),('Japan','36.637464','137.269346',526,449,26,'2020/12/24 11:22:29+00','Toyama'),('Japan','40.781541','140.828896',407,367,6,'2020/12/24 11:22:29+00','Aomori'),('Japan','35.510141','140.198917',9705,7989,107,'2020/12/24 11:22:29+00','Chiba'),('Japan','35.359069','133.863619',79,64,0,'2020/12/24 11:22:29+00','Tottori'),('Japan','34.508018','136.376013',1186,1013,14,'2020/12/24 11:22:29+00','Mie'),('Japan','43.385711','142.552318',12607,10418,398,'2020/12/24 11:22:29+00','Hokkaido'),('Japan','36.504479','138.985605',2087,1628,33,'2020/12/24 11:22:29+00','Gunma'),('Japan','35.215827','136.138064',985,858,11,'2020/12/24 11:22:29+00','Shiga'),('Japan','34.89246','133.826252',1186,642,13,'2020/12/24 11:22:29+00','Okayama'),('Japan','33.911879','135.505446',590,541,7,'2020/12/24 11:22:29+00','Wakayama'),('Japan','34.20119','131.573293',499,411,3,'2020/12/24 11:22:29+00','Yamaguchi'),('Japan','25.768923','126.668016',5105,4689,83,'2020/12/24 11:22:29+00','Okinawa'),('Japan','39.593287','141.361777',348,220,22,'2020/12/24 11:22:29+00','Iwate'),('Japan','32.193204','131.299374',685,606,6,'2020/12/24 11:22:29+00','Miyazaki'),('Japan','35.415312','139.338983',18260,15272,243,'2020/12/24 11:22:29+00','Kanagawa'),('Japan','33.235712','129.608033',492,295,3,'2020/12/24 11:22:29+00','Nagasaki'),('Japan','33.200697','131.43324',594,505,5,'2020/12/24 11:22:29+00','Oita'),('Japan','38.446859','140.927086',1922,1462,12,'2020/12/24 11:22:29+00','Miyagi'),('Japan','31.009484','130.430665',920,795,15,'2020/12/24 11:22:29+00','Kagoshima'),('Japan','37.378867','140.223295',812,593,16,'2020/12/24 11:22:29+00','Fukushima'),('Japan','35.07076','132.554064',189,172,0,'2020/12/24 11:22:29+00','Shimane'),('Japan','39.748679','140.408228',105,92,1,'2020/12/24 11:22:29+00','Akita'),('Japan','36.132134','138.045528',1070,941,10,'2020/12/24 11:22:29+00','Nagano'),('Japan','36.689912','139.819213',1119,843,6,'2020/12/24 11:22:29+00','Tochigi'),('Japan','35.997101','139.347635',12487,9724,183,'2020/12/24 11:22:29+00','Saitama'),('Japan','33.919178','134.242091',194,179,10,'2020/12/24 11:22:29+00','Tokushima'),('Japan','35.846614','136.224654',339,315,11,'2020/12/24 11:22:29+00','Fukui'),('Japan','33.624835','132.856842',389,337,11,'2020/12/24 11:22:29+00','Ehime'),('Japan','34.317451','135.871644',1755,1450,20,'2020/12/24 11:22:29+00','Nara'),('Japan','35.039913','134.828057',8781,7394,141,'2020/12/24 11:22:29+00','Hyogo'),('Japan','33.286977','130.115738',426,381,3,'2020/12/24 11:22:29+00','Saga'),('Japan','35.778671','137.055925',1895,1461,27,'2020/12/24 11:22:29+00','Gifu'),('Japan','34.916975','138.407784',2486,1940,32,'2020/12/24 11:22:29+00','Shizuoka'),('Japan','33.422519','133.367307',592,378,6,'2020/12/24 11:22:29+00','Kochi'),('Japan','33.526032','130.666949',7851,6411,114,'2020/12/24 11:22:29+00','Fukuoka'),('Japan','34.605309','132.788719',2673,1325,18,'2020/12/24 11:22:29+00','Hiroshima'),('Japan','36.303588','140.319591',2226,1926,36,'2020/12/24 11:22:29+00','Ibaraki'),('Japan','34.620965','135.507481',28102,23848,466,'2020/12/24 11:22:29+00','Osaka'),('Japan','','',1824,1659,1,'2020/12/24 11:22:29+00','Port Quarantine'),('Japan','36.769464','136.771027',998,853,51,'2020/12/24 11:22:29+00','Ishikawa'),('Japan','37.521819','138.918647',478,390,3,'2020/12/24 11:22:29+00','Niigata'),('United Kingdom','36.1408','-5.3536',1398,1075,6,'2020/12/24 11:22:29+00','Gibraltar'),('United Kingdom','-51.7963','-59.5236',29,17,0,'2020/12/24 11:22:29+00','Falkland Islands (Malvinas)'),('United Kingdom','49.3723','-2.3644',2857,1817,56,'2020/12/24 11:22:29+00','Channel Islands'),('United Kingdom','54.2361','-4.5481',374,346,25,'2020/12/24 11:22:29+00','Isle of Man'),('United Kingdom','52.1307','-3.7837',131102,0,3200,'2020/12/24 11:22:29+00','Wales'),('United Kingdom','52.3555','-1.1743',1839170,0,60238,'2020/12/24 11:22:29+00','England'),('United Kingdom','56.4907','-4.2026',115556,0,4373,'2020/12/24 11:22:29+00','Scotland'),('United Kingdom','18.2206','-63.0686',11,10,0,'2020/12/24 11:22:29+00','Anguilla'),('United Kingdom','54.7877','-6.4923',63723,0,1240,'2020/12/24 11:22:29+00','Northern Ireland'),('United Kingdom','19.3133','-81.2546',317,290,2,'2020/12/24 11:22:29+00','Cayman Islands'),('United Kingdom','16.742498','-62.187366',13,12,1,'2020/12/24 11:22:29+00','Montserrat'),('United Kingdom','','',0,0,0,'2020/12/24 11:22:29+00','Unknown'),('United Kingdom','18.4207','-64.64',86,74,1,'2020/12/24 11:22:29+00','British Virgin Islands'),('United Kingdom','21.694','-71.7979',807,761,6,'2020/12/24 11:22:29+00','Turks and Caicos Islands'),('United Kingdom','32.3078','-64.7505',553,321,9,'2020/12/24 11:22:29+00','Bermuda');
/*!40000 ALTER TABLE `situation_of_areas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `situation_of_countries`
--

DROP TABLE IF EXISTS `situation_of_countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `situation_of_countries` (
  `country` varchar(15) DEFAULT NULL,
  `confirmed` int DEFAULT NULL,
  `recovered` int DEFAULT NULL,
  `deaths` int DEFAULT NULL,
  `population` int DEFAULT NULL,
  `sq_km_area` int DEFAULT NULL,
  `life_expectancy` varchar(20) DEFAULT NULL,
  `elevation_in_meters` varchar(20) DEFAULT NULL,
  `continent` varchar(20) DEFAULT NULL,
  `abbreviation` varchar(10) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `iso` int DEFAULT NULL,
  `capital_city` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `situation_of_countries`
--

LOCK TABLES `situation_of_countries` WRITE;
/*!40000 ALTER TABLE `situation_of_countries` DISABLE KEYS */;
INSERT INTO `situation_of_countries` VALUES ('China',95298,89104,4767,1409517397,9572900,'71.4','1,840','Asia','CN','Eastern Asia',156,'Peking'),('US',18466231,0,326232,324459463,9363520,'77.1','760','North America','US','North America',840,'Washington'),('Japan',210761,174723,2959,127484450,377829,'80.7','438','Asia','JP','Eastern Asia',392,'Tokyo'),('United Kingdom',2155996,4723,69157,66181585,242900,'77.7','162','Europe','GB','British Isles',826,'London');
/*!40000 ALTER TABLE `situation_of_countries` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-24 21:40:37
