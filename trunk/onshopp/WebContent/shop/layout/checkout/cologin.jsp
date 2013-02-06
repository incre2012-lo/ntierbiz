<%
response.setCharacterEncoding("UTF-8");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", -1);
%>
<%@ taglib uri="/WEB-INF/classes/sm.tld" prefix="xl" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<%@ taglib prefix="s" uri="/struts-tags" %>	

<div class="banner box">
		<h2 class="redbg" >Please enter your username and password for fast checkout</h2>
		<div class="box-content">
			<s:if test="hasActionErrors()">
  				 <div class="errors">
     		 <s:actionerror/>
  			 </div>
		</s:if>
		<s:if test="hasActionMessages()">
  			 <div class="welcome">
    			  <s:actionmessage/>
   			</div>
		</s:if>
		<s:form action="/user/logincheckout" method="post" class="genericForm">
			<s:textfield name="username" key="label.username" size="20" />
			<s:password name="password" key="label.password" size="20" />
			<s:submit method="execute" key="label.login" align="center" />
		</s:form>
		</div>
</div>

<div class="section box">
		<h2 class="redbg" >Or Please enter following details for checkout as a guest<span></span></h2>
		<div class="box-content">
		<s:if test="hasActionErrors()">
  				 <div class="errors">
     		 <s:actionerror/>
  			 </div>
		</s:if>
		<s:if test="hasActionMessages()">
  			 <div class="welcome">
    			  <s:actionmessage/>
   			</div>
		</s:if>
		
		<s:form action="/user/regcheckout" method="post">
			<s:textfield name="user.firstName" label="First Name" />
			<s:textfield name="user.lastName" label="Last Name" />
			<s:textfield name="user.streetAddress" label="Address" />
			<s:textfield name="user.suburb" label="Address2" />
			<s:select name="user.city" label="City" list="{'New Delhi','Adilabad','Agra','Ahmed Nagar','Ahmedabad','Aizawl','Ajmer','Akola','Alappuzha','Aligarh','Alirajpur','Allahabad','Almora','Alwar','Ambala','Ambedkar Nagar','Amravati','Amreli','Amritsar','Anand','Ananthapur','Ananthnag','Angul','Anuppur','Araria','Ariyalur','Arwal','Ashok Nagar','Auraiya','Aurangabad','Aurangabad(BH)','Azamgarh','Bagalkot','Bageshwar','Bagpat','Bahraich','Baksa','Balaghat','Balangir','Baleswar','Ballia','Balrampur','Banaskantha','Banda','Bandipur','Bandra Suburban','Bangalore','Bangalore Rural','Banka','Bankura','Banswara','Barabanki','Baramulla','Baran','Bardhaman','Bareilly','Bargarh','Barmer','Barnala','Barpeta','Barwani','Bastar','Basti','Bathinda','Beed','Begusarai','Belgaum','Bellary','Betul','Bhadrak','Bhagalpur','Bhandara','Bharatpur','Bharuch','Bhavnagar','Bhilwara','Bhind','Bhiwani','Bhojpur','Bhopal','Bidar','Bijapur(CGH)','Bijapur(KAR)','Bijnor','Bikaner','Bilaspur (HP)','Bilaspur(CGH)','Birbhum','Bishnupur','Bokaro','Bongaigaon','Boudh','Budaun','Budgam','Bulandshahr','Buldhana','Bundi','Burhanpur','Buxar','Cachar','Central Delhi','Chamba','Chamoli','Champawat','Champhai','Chamrajnagar','Chandauli','Chandel','Chandigarh','Chandrapur','Changlang','Chatra','Chennai','Chhatarpur','Chhindwara','Chickmagalur','Chikkaballapur','Chitradurga','Chitrakoot','Chittoor','Chittorgarh','Churachandpur','Churu','Coimbatore','Cooch Behar','Cuddalore','Cuddapah','Cuttack','Dadra &amp; Nagar Haveli','Dahod','Dakshina Kannada','Daman','Damoh','Dantewada','Darbhanga','Darjiling','Darrang','Datia','Dausa','Davangere','Debagarh','Dehradun','Deoghar','Deoria','Dewas','Dhalai','Dhamtari','Dhanbad','Dhar','Dharmapuri','Dharwad','Dhemaji','Dhenkanal','Dholpur','Dhubri','Dhule','Dibang Valley','Dibrugarh','Dimapur','Dindigul','Dindori','Diu','Doda','Dumka','Dungarpur','Durg','East Champaran','East Delhi','East Garo Hills','East Godavari','East Kameng','East Khasi Hills','East Midnapore','East Nimar','East Siang','East Sikkim','East Singhbhum','Ernakulam','Erode','Etah','Etawah','Faizabad','Faridabad','Faridkot','Farrukhabad','Fatehabad','Fatehgarh Sahib','Fatehpur','Firozabad','Firozpur','Gadag','Gadchiroli','Gajapati','Ganderbal','Gandhi Nagar','Ganganagar','Ganjam','Garhwa','Gautam Buddha Nagar','Gaya','Ghaziabad','Ghazipur','Giridh','Goalpara','Godda','Golaghat','Gonda','Gondia','Gopalganj','Gorakhpur','Gulbarga','Gumla','Guna','Guntur','Gurdaspur','Gurgaon','Gwalior','Hailakandi','Hamirpur','Hamirpur(HP)','Hanumangarh','Harda','Hardoi','Haridwar','Hassan','Hathras','Haveri','Hazaribag','Hingoli','Hisar','Hooghly','Hoshangabad','Hoshiarpur','Howrah','Hyderabad','Idukki','Imphal East','Imphal West','Indore','Jabalpur','Jagatsinghapur','Jaintia Hills','Jaipur','Jaisalmer','Jajapur','Jalandhar','Jalaun','Jalgaon','Jalna','Jalor','Jalpaiguri','Jammu','Jamnagar','Jamtara','Jamui','Janjgir-champa','Jashpur','Jaunpur','Jehanabad','Jhabua','Jhajjar','Jhalawar','Jhansi','Jharsuguda','Jhujhunu','Jind','Jodhpur','Jorhat','Junagadh','Jyotiba Phule Nagar','K.V.Rangareddy','Kachchh','Kaimur (Bhabua)','Kaithal','Kalahandi','Kamrup','Kanchipuram','Kandhamal','Kangra','Kanker','Kannauj','Kannur','Kanpur Dehat','Kanpur Nagar','Kanyakumari','Kapurthala','Karaikal','Karauli','Karbi Anglong','Kargil','Karim Nagar','Karimganj','Karnal','Karur','Kasargod','Kathua','Katihar','Katni','Kaushambi','Kawardha','Kendrapara','Kendujhar','Khagaria','Khammam','Khandwa','Khargone','Kheda','Kheri','Khorda','Khunti','Kinnaur','Kiphire','Kishanganj','Kishtwar','Kodagu','Koderma','Kohima','Kokrajhar','Kolar','Kolasib','Kolhapur','Kolkata','Kollam','Koppal','Koraput','Korba','Koriya','Kota','Kottayam','Kozhikode','Krishna','Krishnagiri','Kulgam','Kullu','Kupwara','Kurnool','Kurukshetra','Kurung Kumey','Kushinagar','Lahul &amp; Spiti','Lakhimpur','Lakhisarai','Lakshadweep','Lalitpur','Latehar','Latur','Lawngtlai','Leh','Lohardaga','Lohit','Longleng','Lower Dibang Valley','Lower Subansiri','Lucknow','Ludhiana','Lunglei','Madhepura','Madhubani','Madurai','Mahabub Nagar','Maharajganj','Mahasamund','Mahe','Mahendragarh','Mahesana','Mahoba','Mainpuri','Malappuram','Malda','Malkangiri','Mammit','Mandi','Mandla','Mandsaur','Mandya','Mansa','Marigaon','Mathura','Mau','Mayurbhanj','Medak','Medinipur','Meerut','Mirzapur','Moga','Mohali','Mokokchung','Mon','Moradabad','Morena','Muktsar','Mumbai','Munger','Murshidabad','Muzaffarnagar','Muzaffarpur','Mysore','Nabarangapur','Nadia','Nagaon','Nagapattinam','Nagaur','Nagpur','Nainital','Nalanda','Nalbari','Nalgonda','Namakkal','Nanded','Nandurbar','Narayanpur','Narmada','Narsinghpur','Nashik','Navsari','Nawada','Nawanshahr','Nayagarh','Neemuch','Nellore','New Delhi','Nicobar','Nilgiris','Nizamabad','North 24 Parganas','North And Middle Andaman','North Cachar Hills','North Delhi','North Dinajpur','North East Delhi','North Goa','North Sikkim','North Tripura','North West Delhi','Nuapada','Osmanabad','Pakur','Palakkad','Palamau','Pali','Panch Mahals','Panchkula','Panipat','Panna','Papum Pare','Parbhani','Patan','Pathanamthitta','Patiala','Patna','Pauri Garhwal','Perambalur','Peren','Phek','Pilibhit','Pithoragarh','Pondicherry','Poonch','Porbandar','Prakasam','Pratapgarh','Pudukkottai','Pulwama','Pune','Puri','Purnia','Puruliya','Raebareli','Raichur','Raigarh','Raigarh(MH)','Raipur','Raisen','Rajauri','Rajgarh','Rajkot','Rajnandgaon','Rajsamand','Ramanagar','Ramanathapuram','Ramban','Ramgarh','Rampur','Ranchi','Ratlam','Ratnagiri','Rayagada','Reasi','Rewa','Rewari','Ri Bhoi','Rohtak','Rohtas','Ropar','Rudraprayag','Rupnagar','Sabarkantha','Sagar','Saharanpur','Saharsa','Sahibganj','Saiha','Salem','Samastipur','Samba','Sambalpur','Sangli','Sangrur','Sant Kabir Nagar','Sant Ravidas Nagar','Saran','Satara','Satna','Sawai Madhopur','Sehore','Senapati','Seoni','Seraikela-kharsawan','Serchhip','Shahdol','Shahjahanpur','Shajapur','Sheikhpura','Sheohar','Sheopur','Shimla','Shimoga','Shivpuri','Shopian','Shrawasti','Sibsagar','Siddharthnagar','Sidhi','Sikar','Simdega','Sindhudurg','Singrauli','Sirmaur','Sirohi','Sirsa','Sitamarhi','Sitapur','Sivaganga','Siwan','Solan','Solapur','Sonapur','Sonbhadra','Sonipat','Sonitpur','South 24 Parganas','South Andaman','South Delhi','South Dinajpur','South Garo Hills','South Goa','South Sikkim','South Tripura','South West Delhi','Srikakulam','Srinagar','Sultanpur','Sundergarh','Supaul','Surat','Surendra Nagar','Surguja','Tamenglong','Tapi','Tarn Taran','Tawang','Tehri Garhwal','Thane','Thanjavur','The Dangs','Theni','Thiruvananthapuram','Thoubal','Thrissur','Tikamgarh','Tinsukia','Tirap','Tiruchirappalli','Tirunelveli','Tiruvallur','Tiruvannamalai','Tiruvarur','Tonk','Tuensang','Tumkur','Tuticorin','Udaipur','Udham Singh Nagar','Udhampur','Udupi','Ujjain','Ukhrul','Umaria','Una','Unnao','Upper Siang','Upper Subansiri','Uttara Kannada','Uttarkashi','Vadodara','Vaishali','Valsad','Varanasi','Vellore','Vidisha','Villupuram','Virudhunagar','Visakhapatnam','Vizianagaram','Warangal','Wardha','Washim','Wayanad','West Champaran','West Delhi','West Garo Hills','West Godavari','West Kameng','West Khasi Hills','West Midnapore','West Nimar','West Siang','West Sikkim','West Singhbhum','West Tripura','Wokha','Yadgir','Yamuna Nagar','Yanam','Yavatmal','Zunhebotto'}"/>
			<s:textfield name="user.postcode" label="Pin Code" />
			<s:select name="user.state" label="State" list="{'DELHI','ANDAMAN & NICOBAR ISLANDS','ANDHRA PRADESH','ARUNACHAL PRADESH','ASSAM','BIHAR','CHANDIGARH','CHATTISGARH','DADRA & NAGAR HAVELI','DAMAN & DIU','GOA','GUJARAT','HARYANA','HIMACHAL PRADESH','JAMMU & KASHMIR','JHARKHAND','KARNATAKA','KERALA','LAKSHADWEEP','MADHYA PRADESH','MAHARASHTRA','MANIPUR','MEGHALAYA','MIZORAM','NAGALAND','ORISSA','PONDICHERRY','PUNJAB','RAJASTHAN','SIKKIM','TAMIL NADU','TRIPURA','UTTAR PRADESH','UTTARAKHAND','WEST BENGAL'}"/>
			<s:select name="user.country" label="Country" list="{'India'}"  />	
			<s:textfield name="user.telephone" label="Telephone/Mobile" />
			<s:textfield name="user.email" label="Email ID" />	
			<s:submit />
		</s:form>
		</div>
</div>
