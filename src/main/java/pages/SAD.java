package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class SAD {
	WebDriver driver;
	public static String vesselAdviseNo;
	public static String SADRequestNumber;
	public static String ShipIdentificationNo;
	// public static String VoyageNumber;
	public static String ShipCallNumber;
	public static String ShipName;

	@FindBy(xpath = "//*[@id='signin-link']/strong")
	static WebElement liLogin;
	@FindBy(xpath = "//*[@id='sUserId']")
	static WebElement txtLoginId;
	
	@FindBy(xpath = "//*[@id='sUserPassword']")
	static WebElement txtPassword;
	@FindBy(xpath = "//*[@id='signin-dropdown']/form/table/tbody/tr[6]/td/input")
	static WebElement btnLoginInUcustoms;
	@FindBy(xpath = "/html/body/div[3]/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a") ////*[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a
	                 
	static WebElement liSignOut;
	// ---------------------------------------Menu-------
	@FindBy(xpath = "//*[@id='mb_ShipCargo']/a")
	static WebElement menuShipCargo;
	@FindBy(partialLinkText = "Ship Clearance")
	static WebElement subMenuShipClearance;
	@FindBy(partialLinkText = "Ship Arrival Declarations")
	static WebElement nestedSubMenuShipArrivalDeclarations;

	@FindBy(xpath = "//*[@id='btnNew']") // *[@id="btnNew"]
	static WebElement btnNew;
	@FindBy(xpath = "//*[@id='List_ShipArrivalDeclLs_0_ID0EAABAAA']/a/i")
	static WebElement lnkOpenSAD;
	@FindBy(xpath = "//*[@id='chkallID0EAAAABA']")
	static WebElement chkSAD_lst;
	@FindBy(xpath = "//*[@id='btnDelete']")
	static WebElement btnDelete;
	@FindBy(xpath = "//*[@id='btnShpID']")
	static WebElement btnShpID;
	@FindBy(xpath = "//*[@id='frame_ShipDeclJourPopLsPg']")
	static WebElement frame_ShipDeclJourPopLsPg;
	// -------------------------Search ------------------

	@FindBy(xpath = "//*[@id='txtJrnNo']")
	static WebElement txtJrnNo;
	@FindBy(xpath = "//*[@id='txtNameOfShip']")
	static WebElement txtNameOfShip;
	@FindBy(id="txtSCIdNo")
	static WebElement txtSCIdNo;
	@FindBy(id="txtImoNo")
	static WebElement txtImoNo; 
	@FindBy(id="txtShiNo")
	static WebElement txtShiNo;
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[12]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id='List_ShipDeclJourPopLs_0_VesselNumber']/a")
	static WebElement lnkShipID;
	// -------------------------------------------------------
	@FindBy(xpath = "//*[@id='txtNMaster']")
	static WebElement txtNameofMaster;
	@FindBy(xpath = "//*[@id='txtTypeOfVoy']")
	static WebElement ddlTypeOfVoy;
	@FindBy(xpath = "//*[@id='DDLPSPort']")
	static WebElement ddlPositionOfShipInThePort;
	@FindBy(xpath = "//*[@id='txtNPOC']")
	static WebElement txtNPOC;
	@FindBy(xpath = "//*[@id='txtBurthem']")
	static WebElement txtBurthen;
	@FindBy(xpath = "//*[@id='txtMeanDraft']")
	static WebElement txtMeanDraft;
	@FindBy(xpath = "//*[@id='DDlPurCall']")
	static WebElement ddlPurCall;
	@FindBy(xpath = "//*[@id='txtOthrPurCall']")
	static WebElement txtOthrPurCall;
	@FindBy(xpath = "//*[@id='txtBrfDesc']")
	static WebElement txtBrfDesc;
	@FindBy(xpath = "//*[@id='txtBrfDescVoy']")
	static WebElement txtBrfDescVoy;
	@FindBy(xpath = "//*[@id='txtShpDesc']")
	static WebElement txtShpDesc;
	@FindBy(xpath = "//*[@id='txtRemarks']")
	static WebElement txtRemarks;
	@FindBy(xpath = "//*[@id='ChkAcknoeledge']")
	static WebElement ChkAcknoeledge;
	// --------------Link Repository-------------
	@FindBy(xpath = "//*[@id=\"ShipArrivalDeclFr_Links_icon\"]/i")
	static WebElement linkRepository;
	@FindBy(partialLinkText = "Cargo General Declaration (FAL 2)")
	static WebElement lnkFAL2;
	@FindBy(partialLinkText = "Ship Stores Declaration (FAL3)")
	static WebElement lnkFAL3;
	@FindBy(partialLinkText = "Crew's Effects Declaration (FAL 4)")
	static WebElement lnkFAL4;
	@FindBy(partialLinkText = "Crew List (FAL 5)")
	static WebElement lnkFAL5;
	@FindBy(partialLinkText = "Passenger List (FAL 6)")
	static WebElement lnkFAL6;
	@FindBy(partialLinkText = "Dangerous Goods Declaration (FAL7)")
	static WebElement lnkFAL7;
	@FindBy(partialLinkText = "Last 10 Ports of Calls List")
	static WebElement lnkLast10Port;
	@FindBy(partialLinkText = "Immigration Clearance Form")
	static WebElement lnkImmigration;
	@FindBy(partialLinkText = "Vessel Advise Form (PKP)")
	static WebElement lnkPKP;
	@FindBy(partialLinkText = "PANS") // Pre-Arrival Notification of Security (PANS) Form
	static WebElement lnkPANS;
	@FindBy(partialLinkText = "Petroleum Safety Measures (Form A)")
	static WebElement lnkFormA;
	@FindBy(partialLinkText = "View / Upload Documents")
	static WebElement lnkUploadDoc;
	@FindBy(partialLinkText = "View Ship Details")
	static WebElement lnkViewShipDetails;
	@FindBy(partialLinkText = "View Agent Details")
	static WebElement lnkViewAgentDetails;
	@FindBy(partialLinkText = "View General Information")
	static WebElement lnkViewGeneralInfo;
	@FindBy(partialLinkText = "View Error File")
	static WebElement lnkViewErrorFile;
	@FindBy(partialLinkText = "Ship Arrival Declarations")
	static WebElement lnkShipArrivalDec;
	@FindBy(partialLinkText = "Last 10 Ports of Calls List")
	static WebElement lnkLast10PortOfCallsList;
	@FindBy(partialLinkText = "View Remarks History")
	static WebElement lnkRemarksHistory;
	@FindBy(partialLinkText = "Health Details")
	static WebElement lnkHealthDetails;
	@FindBy(partialLinkText = "Maritime Declaration of Health")
	static WebElement lnkMaritimeDeclarationofHealth;
	@FindBy(partialLinkText = "Crew Vaccination Details")
	static WebElement lnkCrewVaccinationDetails;
	@FindBy(partialLinkText = "JLM/ISPS/PAN/3")
	static WebElement lnkJLM_ISPS_PAN3;
	@FindBy(partialLinkText = "JLM/ISPS/PAN/4")
	static WebElement lnkJLM_ISPS_PAN4;

	// ------------IFrame-------------
	@FindBy(id = "frame_SCCargoGeneralDeclarationFrPG")
	static WebElement frame_FAL2;
	@FindBy(id = "frame_SCSCShipStoresDeclarationFrPg")
	static WebElement frame_FAL3;
	@FindBy(id = "frame_CrewEffectsDeclarationFrPg")
	static WebElement frame_FAL4;
	@FindBy(id = "frame_CrewEffectsDetailsFrPg")
	static WebElement frame_FAL4CrewEffects;
	@FindBy(id = "frame_SCCrewInformationFrPg")
	static WebElement frame_FAL5;
	@FindBy(id = "frame_SCPassengersFrPg")
	static WebElement frame_FAL6;
	@FindBy(id = "frame_SCDGGoodsFrPg")
	static WebElement frame_FAL7;
	@FindBy(id = "frame_SCDGCargoDeclarationDetailsLsPg")
	static WebElement frame_FAL7Remain;
	@FindBy(id = "frame_SCDGGoodsBillOfLadingPopUpPg")
	static WebElement frame_FAL7DG;
	@FindBy(id = "frame_SCDGGoodsDeclarationsPopUpPg")
	static WebElement frame_FAL7Dec;
	@FindBy(id = "frame_NexportofcallFrPg")
	static WebElement frame_10PortofCall;
	@FindBy(id = "frame_SCImmigrationClearanceFrPg")
	static WebElement frame_Immigration;
	@FindBy(id = "frame_SCVesselAdvisePKPFrPg")
	static WebElement frame_PKP;
	@FindBy(id = "frame_HealthDetailsFrPg")
	static WebElement frame_HealthDetails;
	@FindBy(id = "frame_SCMHealthDeclarationFrPg")
	static WebElement frame_MHealthDeclaration;
	@FindBy(id = "frame_SCVaccinationFrPg")
	static WebElement frame_SCVaccination;
	@FindBy(id = "frame_SCUploadErrorLsPg")
	static WebElement frame_UploadErrorLog;
	@FindBy(id = "frame_ShipDetailsViewPg")
	static WebElement frame_ShipDetailsView;
	@FindBy(id = "frame_ViewConsigneeDetailPg")
	static WebElement frame_ViewAgent;
	@FindBy(id = "FTPUploadDocs")
	static WebElement frame_FTPUploadDocs;
	@FindBy(id = "frame_SCRemarksHistoryLsPg")
	static WebElement frame_RemarksHistory;
	@FindBy(id = "frame_SCPANSecurityFrPg")
	static WebElement frame_PANS;
	@FindBy(id = "frame_ISPSCodeComplainceListFrPg")
	static WebElement frame_JlmIspaPAN3;
	@FindBy(id = "frame_ScJlmIspsPanFrPg")
	static WebElement frame_JlmIspsPANS4;
	@FindBy(id = "frame_SCGeneralInfoViewPg")
	static WebElement frame_GeneralInfo;
	@FindBy(id = "frame_SCPetroleumSafMeasuresFrPg")
	static WebElement frame_FormA;
	@FindBy(id = "frame_SCPetroleumBOLPopUpLsPg")
	static WebElement frame_FormA_BOL;

	// ---------------FAL2--------------------------

	@FindBy(xpath = "//*[@id=\"EnclRow_SCCargoHouseBillDetailsLs_Table\"]/table/tbody/tr[3]/td/table/tbody/tr/td/b")
	static WebElement txtNoRecords;
	@FindBy(xpath = "//*[@id=\"List_SCCargoHouseBillDetailsLs_ColHeader_\"]/a")
	static WebElement lnkBLNo;
	@FindBy(xpath = "//*[@id='List_SCHBItemsLs_ColHeader_']/a")
	static WebElement lnkItemHSCoad;
	@FindBy(xpath = "//*[@id=\"List_SCCargoHouseBillDetailsLs_0_ID1EAABBAA\"]/a/i")
	static WebElement linkOpenHBL;
	@FindBy(xpath = "//*[@id=\"List_SCHBItemsLs_0_ID2EAABAAA\"]/a/i")
	static WebElement linkOpenHBLL;
	@FindBy(xpath = "//*[@id='btnNew']")
	static WebElement btnNewRemainOnBoar;
	@FindBy(xpath = "//*[@id='txtBolNo']")
	static WebElement txtBolNo;
	@FindBy(xpath = "//*[@id='txtHScode']")
	static WebElement txtHScode;
	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li[1]/a")
	static WebElement autoCompleteDiv;
	@FindBy(xpath = "//*[@id='txtDescOfGoods']")
	static WebElement txtDescOfGoods;
	@FindBy(xpath = "//*[@id='txtContID']")
	static WebElement txtContID;
	@FindBy(xpath = "//*[@id='txtMrks']")
	static WebElement txtMrks;
	@FindBy(xpath = "//*[@id='txtPkgNo']")
	static WebElement txtPkgNo;
	@FindBy(xpath = "//*[@id='BOlQuantity']")
	static WebElement txtTypeOfPack;
	@FindBy(xpath = "//*[@id='txtGrossweight']")
	static WebElement txtGrossweight;
	@FindBy(xpath = "//*[@id='txtUOM']")
	static WebElement txtUOM;
	@FindBy(xpath = "//*[@id='txtPortofLanding']")
	static WebElement txtPortofLanding;
	@FindBy(xpath = "//*[@id='PortOfDischarge']")
	static WebElement txtPortOfDischarge;
	@FindBy(xpath = "//*[@id='chkRemainOnBoard']")
	static WebElement chkRemainOnBoard;
	@FindBy(xpath = "//*[@id='chkIsSplitHouseBill']")
	static WebElement chkIsSplitHouseBill;
	// ------------FAL3--------------

	@FindBy(xpath = "//*[@id='txtPeriodofStay']")
	static WebElement txtPeriodofStay;
	@FindBy(xpath = "//*[@id='ChkNillStores']")
	static WebElement ChkNillStores;
	@FindBy(xpath = "//*[@id='btnENew']")
	static WebElement btnENew;
	@FindBy(xpath = "//*[@id='txtNameArticle']")
	static WebElement txtNameArticle;
	@FindBy(xpath = "//*[@id='txtLocBoard']")
	static WebElement txtLocBoard;
	@FindBy(xpath = "//*[@id='txtNAOthers']")
	static WebElement txtNAOthers;
	@FindBy(xpath = "//*[@id='txtLBOthers']")
	static WebElement txtLBOthers;
	@FindBy(xpath = "//*[@id='txtQuantity']")
	static WebElement txtQuantity;
	@FindBy(xpath = "//*[@id='ddlGrossWeightUOM']")
	static WebElement ddlGrossWeightUOM;

	// ------------FAL4--------------
	@FindBy(xpath = "//*[@id='ChkNilEffects']")
	static WebElement ChkNilEffects;
	@FindBy(xpath = "//*[@id=\"btnNew\"]")
	static WebElement btnNewCrew;
	@FindBy(xpath = "//*[@attribute='FamilyName']")
	static WebElement txtFamilyName;
	// @FindBy(xpath = "//*[@id='txxothdoc']")
	// static WebElement txxothdoc;
	@FindBy(xpath = "//*[@attribute='RankorRating']")
	static WebElement txtRankorRating;
	@FindBy(xpath = "//*[@id='txtGoodsDescription']")
	static WebElement txtGoodsDescription;
	// ------------FAL5--------------
	@FindBy(xpath = "//*[@id=\"btnAdd\"]")
	static WebElement btnAdd;
	@FindBy(xpath = "//*[@id=\"txtName\"]")
	static WebElement txtFmlyName;
	@FindBy(xpath = "//*[@id=\"txtRank\"]")
	static WebElement txtRank;
	@FindBy(xpath = "//*[@id=\"txtCountry\"]")
	static WebElement txtCountry;
	@FindBy(xpath = "//*[@id=\"ddlAmendReason\"]")
	static WebElement ddlTravelDocument;
	@FindBy(xpath = "//*[@id=\"txxothdoc\"]")
	static WebElement txtothdoc;
	@FindBy(xpath = "//*[@id=\"txtDocNo\"]")
	static WebElement txtDocNo;
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/div/select[2]")
	static WebElement year_datepicker;
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/div/select[1]")
	static WebElement month_datepicker;
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]/a") // 2nd Row 1 Column
	static WebElement select_date;
	@FindBy(xpath = "//*[@id=\"txtDOBDatePicker\"]")
	static WebElement txtDOBDatePicker;
	@FindBy(xpath = "//*[@id=\"txtBirthPlace\"]")
	static WebElement txtBirthPlace;
	@FindBy(xpath = "//*[@id=\"txtIssueDateDatePicker\"]")
	static WebElement txtIssueDateDatePicker;
	@FindBy(xpath = "//*[@id=\"txtExpiryDateDatePicker\"]")
	static WebElement txtExpiryDateDatePicker;
	@FindBy(xpath = "//*[@id=\"txtBookNo\"]")
	static WebElement txtBookNo;
	@FindBy(xpath = "//*[@id=\"txtCountrypt\"]")
	static WebElement txtCountrypt;
	@FindBy(xpath = "//*[@id=\"txtValidDateDatePicker\"]")
	static WebElement txtValidDateDatePicker;
	// ------------FAL6--------------
	@FindBy(xpath = "//*[@id=\"chkNilPassengers\"]")
	static WebElement chkNilPassengers;
	@FindBy(xpath = "//*[@id=\"txtFamilyName\"]")
	static WebElement txtFamilyName_passenger;
	@FindBy(xpath = "//*[@id=\"txtNationality\"]")
	static WebElement txtNationality;
	@FindBy(xpath = "//*[@id=\"txtPOB\"]")
	static WebElement txtPOB;
	@FindBy(xpath = "//*[@id=\"txtTDT\"]")
	static WebElement txtTDT;
	@FindBy(xpath = "//*[@attribute=\"DocumentNo\"]")
	static WebElement txtDocumentNo;
	@FindBy(xpath = "//*[@id=\"txtDIDDatePicker\"]")
	static WebElement txtDIDDatePicker;
	@FindBy(xpath = "//*[@id=\"txtDEDDatePicker\"]")
	static WebElement txtDEDDatePicker;
	@FindBy(xpath = "//*[@id=\"rboTransitPassNo\"]")
	static WebElement rboTransitPassNo;
	@FindBy(xpath = "//*[@id=\"rboTransitPassYes\"]")
	static WebElement rboTransitPassYes;
	@FindBy(xpath = "//*[@id=\"txtPOE\"]")
	static WebElement txtPOE;
	@FindBy(xpath = "//*[@id=\"txtPOD\"]")
	static WebElement txtPOD;

	// ------------FAL7---------------
	@FindBy(xpath = "//*[@id='chkNilDGGoods']")
	static WebElement chkNilDGGoods;
	@FindBy(xpath = "//*[@id='chkISArmSecOnBoard']")
	static WebElement chkISArmSecOnBoard;
	@FindBy(xpath = "//*[@id='browsebutton']")
	static WebElement browsebutton;
	@FindBy(xpath = "//*[@id='chk_ID1EAAAABA_0']")
	static WebElement ID1EAAAABA;
	@FindBy(xpath = "//*[@id='buttonID1EAAAABA']")
	static WebElement buttonID1EAAAABA;
	@FindBy(xpath = "//*[@id=\"List_SCDGGoodDetailsList_0_ID1EAABDAA\"]/a/i") // *[@id="List_SCDGGoodDetailsList_0_ID1EAABDAA"]/a/i
	static WebElement List_SCDGGoodDetailsList_0_ID1EAABDAA;
	@FindBy(xpath = "//*[@id='txtMarksandNumbers']")
	static WebElement txtMarksandNumbers;
	@FindBy(xpath = "//*[@id='txtContainerIDNo']")
	static WebElement txtContainerIDNo;
	@FindBy(xpath = "//*[@id='txtVehicleRegistrationNo']")
	static WebElement txtVehicleRegistrationNo;
	@FindBy(xpath = "//*[@id='txtNoofPackages']")
	static WebElement txtNoofPackages;
	@FindBy(xpath = "//*[@id='ddlPackageTypeId']")
	static WebElement ddlPackageTypeId;
	@FindBy(xpath = "//*[@id='txtProperShippingName']")
	static WebElement txtProperShippingName;
	@FindBy(xpath = "//*[@id='txtProperShippingDescription']")
	static WebElement txtProperShippingDescription;
	@FindBy(xpath = "//*[@id='txtIMDGClass']")
	static WebElement txtIMDGClass;
	@FindBy(xpath = "//*[@id='txtUNNo']")
	static WebElement txtUNNo;
	@FindBy(xpath = "//*[@id='txtBPAGroup']")
	static WebElement txtBPAGroup;
	@FindBy(xpath = "//*[@id='txtClass7ScheduleNumber']")
	static WebElement txtClass7ScheduleNumber;
	@FindBy(xpath = "//*[@id='txtContrlndEmergencyTemp']")
	static WebElement txtContrlndEmergencyTemp;
	@FindBy(xpath = "//*[@id='txtSubsidiaryRisks']")
	static WebElement txtSubsidiaryRisks;
	@FindBy(xpath = "//*[@id='txtFlashPoint']")
	static WebElement txtFlashPoint;
	@FindBy(xpath = "//*[@id='txtMarinePollutant']")
	static WebElement txtMarinePollutant;
	@FindBy(xpath = "//*[@id='txtGrossWeight']")
	static WebElement txtGrossWeight;
	@FindBy(xpath = "//*[@id='txtNetWeight']")
	static WebElement txtNetWeight;
	// @FindBy(xpath = "//*[@id='ddlGrossWeightUOM']")
	// static WebElement ddlGrossWeightUOM;
	@FindBy(xpath = "//*[@id='txtEmS']")
	static WebElement txtEmS;
	@FindBy(xpath = "//*[@id='txtStowagePositiononBoard']")
	static WebElement txtStowagePositiononBoard;
	@FindBy(xpath = "//*[@id='txtPortofDischarge']")
	static WebElement txtPortofDischarge;
	// ------------Last10------------
	@FindBy(id = "chckVooy")
	static WebElement chckVooy;
	@FindBy(id = "txtreason")
	static WebElement txtreason;
	@FindBy(id = "new1")
	static WebElement new1;
	@FindBy(id = "txtlocationname")
	static WebElement txtlocationname;
	@FindBy(id = "txtarrivalDatePicker")
	static WebElement txtarrivalDatePicker;
	@FindBy(id = "txtarrivalDatePicker")
	static WebElement ddlArrivalHrs;
	@FindBy(id = "ArrivalMins")
	static WebElement ddlArrivalMins;
	@FindBy(id = "txtdepartureDatePicker")
	static WebElement txtdepartureDatePicker;
	@FindBy(id = "ExpectedDepartureDateHrs")
	static WebElement ddlDepartureHrs;
	@FindBy(id = "ExpectedDepartureDateMins")
	static WebElement ddlDepartureMins;
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]")
	static WebElement btnToday;
	@FindBy(id = "txtISPS")
	static WebElement ddlISPS;
	// ------------Immigration--------
	@FindBy(id = "txtApplicantRemarks")
	static WebElement txtApplicantRemarks;
	@FindBy(xpath = "//*[@id=\"SCImmigrationClearanceFr_Links_icon\"]/i")
	static WebElement lnkImmigrationClearance;
	@FindBy(id = "ddlDocumentTypes")
	static WebElement ddlDocumentTypes;
	@FindBy(id = "txtOther")
	static WebElement txtOther;
	@FindBy(id = "file_upload")
	static WebElement file_upload;
	@FindBy(id = "txtDocumentReferenceNo")
	static WebElement txtDocumentReferenceNo;
	@FindBy(xpath = "//*[@id=\"TRExpireDate\"]/td[3]/img")
	static WebElement imgExpiryDate;
	@FindBy(id = "txtDescription")
	static WebElement txtDescription;
	@FindBy(id = "btnUpload")
	static WebElement btnUpload;
	@FindBy(xpath = "//*[@id=\"MainDocument\"]/body/div[7]/div[11]/input")
	static WebElement btnClosePopUp;

	// ------------PKP--------
	@FindBy(id = "txtAdviseNo")
	static WebElement txtAdviseNo;
	@FindBy(id = "txtPortName")
	static WebElement txtPortName;
	@FindBy(id = "txtCrewRem")
	static WebElement txtCrewRem;
	@FindBy(id = "txtPassangerRem")
	static WebElement txtPassangerRem;
	@FindBy(id = "txtApplicantRem")
	static WebElement txtApplicantRem;
	@FindBy(id = "txtWharf")
	static WebElement txtWharf;
	@FindBy(name = "txtStowawaysDescription")
	static WebElement txtStowawaysDescription;
	@FindBy(xpath = "//*[@id=\"SCVesselAdvisePKPFr_Links_icon\"]/i")
	static WebElement lnkRepoPKP;
	@FindBy(id = "radioplugfeveryes")
	static WebElement rdPlugFeverYes;
	@FindBy(id = "radioplugfeverno")
	static WebElement rdPlugFeverNo;
	@FindBy(id = "IsPlaugeOccuredyes")
	static WebElement rdIsPlaugeOccuredYes;
	@FindBy(id = "IsPlaugeOccuredno")
	static WebElement rdIsPlaugeOccuredNo;
	@FindBy(id = "AnyPersonDiedOnBoardyes")
	static WebElement rdAnyPersonDiedOnBoardYes;
	@FindBy(id = "AnyPersonDiedOnBoardno")
	static WebElement rdAnyPersonDiedOnBoardNo;
	@FindBy(id = "InfectiousDisesesyes") // *[@id="InfectiousDisesesyes"]
	static WebElement rdInfectiousDisesesYes;
	@FindBy(id = "InfectiousDisesesno")
	static WebElement rdInfectiousDisesesNo;
	@FindBy(xpath = "//*[@id=\"SickPersonOnBoardyes\"]")
	static WebElement rdSickPersonOnBoardYes;
	@FindBy(xpath = "//*[@id=\"SickPersonOnBoardno\"]")
	static WebElement rdSickPersonOnBoardNo;
	@FindBy(xpath = "//*[@id=\"InfectionConditionsyes\"]")
	static WebElement rdInfectionConditionsYes;
	@FindBy(xpath = "//*[@id=\"InfectionConditionsno\"]")
	static WebElement rdInfectionConditionsNo;
	@FindBy(xpath = "//*[@id=\"SanityMeasuresAppliedyes\"]")
	static WebElement rdSanityMeasuresAppliedYes;
	@FindBy(xpath = "//*[@id=\"SanityMeasuresAppliedno\"]")
	static WebElement rdSanityMeasuresAppliedNo;
	@FindBy(xpath = "//*[@id=\"StowawaysFoundyes\"]")
	static WebElement rdStowawaysFoundYes;
	@FindBy(xpath = "//*[@id=\"StowawaysFoundno\"]")
	static WebElement rdStowawaysFoundNo;
	@FindBy(xpath = "//*[@id=\"SickAnimalOnboardyes\"]")
	static WebElement rdSickAnimalOnboardYes;
	@FindBy(xpath = "//*[@id=\"SickAnimalOnboardno\"]") // *[@id="SickAnimalOnboardno"]
	static WebElement rdSickAnimalOnboardNo;
	@FindBy(id = "txtFname")
	static WebElement txtFname;
	@FindBy(id = "txtRate")
	static WebElement txtRate;

	// ------------PANS--------
	@FindBy(id = "txtPortFacility")
	static WebElement txtPortFacility;
	@FindBy(id = "ddlPortCLfor")
	static WebElement ddlPortCLfor;
	@FindBy(id = "txtSecLevelOnboardShip")
	static WebElement txtSecLevelOnboardShip;
	@FindBy(id = "rdbYes")
	static WebElement rdbYes;
	@FindBy(id = "rdbNo")
	static WebElement rdbNo;
	@FindBy(id = "txtShipSecuOfficerName")
	static WebElement txtShipSecuOfficerName;
	@FindBy(id = "txtPhoneNumber")
	static WebElement txtPhoneNumber;
	@FindBy(id = "txtEmail")
	static WebElement txtEmail;
	@FindBy(id = "txtMMSINumber")
	static WebElement txtMMSINumber;
	@FindBy(id = "txtNameAnchMarineFacility")
	static WebElement txtNameAnchMarineFacility;
	@FindBy(id = "txtLatitude1")
	static WebElement txtLatitude1;
	@FindBy(id = "txtLatitude2")
	static WebElement txtLatitude2;
	@FindBy(id = "txtLatitude3")
	static WebElement txtLatitude3;
	@FindBy(id = "LatiDirectionN")
	static WebElement rdLatiDirectionN;
	@FindBy(id = "LatiDirectionS")
	static WebElement rdLatiDirectionS;
	@FindBy(id = "txtOtherParticulars")
	static WebElement txtOtherParticulars;
	@FindBy(id = "txtLongitude1")
	static WebElement txtLongitude1;
	@FindBy(id = "txtLongitude2")
	static WebElement txtLongitude2;
	@FindBy(id = "txtLongitude3")
	static WebElement txtLongitude3;
	@FindBy(id = "LongDirection")
	static WebElement rdLongDirection;
	@FindBy(id = "rbtnResYes")
	static WebElement rbtnResYes;
	@FindBy(id = "rbtnResNo")
	static WebElement rbtnResNo;
	@FindBy(id = "txtProhibitedGoods")
	static WebElement txtProhibitedGoods;
	@FindBy(id = "rbtnCertYes")
	static WebElement rbtnCertYes;
	@FindBy(id = "rbtnCertNo")
	static WebElement rbtnCertNo;
	@FindBy(id = "rbtnFacilityYes")
	static WebElement rbtnFacilityYes;
	@FindBy(id = "rbtnFacilityNo")
	static WebElement rbtnFacilityNo;
	@FindBy(id = "chkDeclaration")
	static WebElement chkDeclaration;

	@FindBy(xpath = "//*[@id=\"SCPANSecurityFr_Links_icon\"]/i")
	static WebElement lnkPANSecurityRepo;
	// ------------JLM/ISPS/PAN/3
	@FindBy(id = "radiobuttofacilityyes")
	static WebElement rdFacilityYes;
	@FindBy(id = "radiobuttofacilityno")
	static WebElement rdFacilityNo;
	@FindBy(id = "radiobuttostayyes")
	static WebElement rdStayYes;
	@FindBy(id = "radiobuttostayno")
	static WebElement rdStayNo;
	@FindBy(id = "radiobuttoncrewyes")
	static WebElement rdCrewYes;
	@FindBy(id = "radiobuttoncrewno")
	static WebElement rdCrewNo;
	@FindBy(id = "radiobuttononbordyes")
	static WebElement rdOnordYes;
	@FindBy(id = "radiobuttononbordno")
	static WebElement rdOnbordNo;
	@FindBy(id = "radiobuttonmaniyes")
	static WebElement rdNmaniYes;
	@FindBy(id = "radiobuttonmanino")
	static WebElement rdManiNo;
	@FindBy(id = "radiobuttonavilayes")
	static WebElement rdAvilaYes;
	@FindBy(id = "radiobuttonavilano")
	static WebElement rdAvilaNo;
	@FindBy(id = "radiobuttonreqyes")
	static WebElement rdReqYes;
	@FindBy(id = "radiobuttonreqno")
	static WebElement rdReqNo;
	@FindBy(id = "radiobuttonrecyes")
	static WebElement rdRecYes;
	@FindBy(id = "radiobuttonrecno")
	static WebElement rdRecNo;
	@FindBy(id = "radiobuttondengyes")
	static WebElement rdDengYes;
	@FindBy(id = "radiobuttondengno")
	static WebElement rdDengNo;
	@FindBy(id = "textboxImdcode")
	static WebElement textboxImdcode;
	@FindBy(id = "radiobuttononboard")
	static WebElement rdOnboardYes;
	@FindBy(id = "radiobutton9")
	static WebElement rdResolNo;
	@FindBy(id = "textboxonboard")
	static WebElement textboxonboard;
	// ---------JLM/ISPS/PAN/4
	@FindBy(id = "rbtnLastportofcallyes")
	static WebElement rbLastPortOfCallYes;
	@FindBy(id = "rbtnLastportofcallno")
	static WebElement rbLastPortOfCallNo;
	@FindBy(id = "rbtnIsportcalIspsyes")
	static WebElement rbIsportCalIspsYes;
	@FindBy(id = "radiobuttostayno")
	static WebElement rbOstayNo;
	@FindBy(id = "rbtnImposAtLastportyes")
	static WebElement rbImposAtLastPortYes;
	@FindBy(id = "rbtnImposAtLastportno")
	static WebElement rbImposAtLastPortNo;
	@FindBy(id = "txtDetails")
	static WebElement txtDetails;
	@FindBy(id = "rbtnIsYouConSSAyes")
	static WebElement rbIsYouConSSAYes;
	@FindBy(id = "rbtnrbtnIsYouConSSAno")
	static WebElement rbIsYouConSSAno;
	@FindBy(id = "rbtnisSspOnBoardyes")
	static WebElement rbIsSspOnBoardYes;
	@FindBy(id = "rbtnisSspOnBoardno")
	static WebElement rbIsSspOnBoardNo;

	@FindBy(id = "rbtnisSspImplimentedyes")
	static WebElement rbIsSspImplimentedYes;
	@FindBy(id = "rbtnisSspImplimentedno")
	static WebElement rbIsSspImplimentedNo;
	@FindBy(id = "rbtnIsShipCrewSsoyes") // CREW PARTICULARS
	static WebElement rbIsShipCrewSsoyes;
	@FindBy(id = "rbtnIsShipCrewSsono")
	static WebElement rbIsShipCrewSsoNo;
	@FindBy(id = "rbtnIsCrewAwarnessyes")
	static WebElement rbIsCrewAwarnessYes;
	@FindBy(id = "rbtnIsCrewAwarnessno")
	static WebElement rbIsCrewAwarnessNo;
	@FindBy(id = "rbtnIsfullgangwayyes")
	static WebElement rbIsfullgangwayYes;
	@FindBy(id = "rbtnIsfullgangwayno")
	static WebElement rbIsfullgangwayNo;
	@FindBy(id = "rbtnIsUnlawfulboardingyes")
	static WebElement rbIsUnlawfulboardingYes;
	@FindBy(id = "rbtnIsUnlawfulboardingno")
	static WebElement rbIsUnlawfulboardingNo;
	@FindBy(id = "rbtnIsstowawayconductedyes")
	static WebElement rbIsstowawayconductedYes;
	@FindBy(id = "rbtnIsstowawayconductedno")
	static WebElement rbIsstowawayconductedNo;
	// @FindBy(id="rbtnIsstowawayconductedyes")
	// static WebElement rbIsstowawayconductedYes;
	// @FindBy(id="rbtnIsstowawayconductedno")
	// static WebElement rbIsstowawayconductedNo;
	@FindBy(id = "rbtnIsstowawayFoundyes")
	static WebElement rbIsstowawayFoundYes;
	@FindBy(id = "rbtnIsstowawayFoundno")
	static WebElement rbIsstowawayFoundNo;
	@FindBy(id = "rbtnIsNoLoadinglasportyes") // CARGO PARTICULARS
	static WebElement rbIsNoLoadinglasportYes;
	@FindBy(id = "rbtnIsNoLoadinglasportno")
	static WebElement rbIsNoLoadinglasportNo;

	// ------------FORM A--------
	@FindBy(id = "btnAss")
	static WebElement btnAss;
	@FindBy(id = "chk_ID1EAAAABA_0")
	static WebElement chk_ID1EAAAABA_0;
	@FindBy(id = "buttonID1EAAAABA")
	static WebElement btnSaveID1EAAAABA;
	// ------------Upload--------

	// ---------------Buttons---------------------------
	@FindBy(xpath = "//button[text()='Create']")
	static WebElement btnCreate;
	@FindBy(xpath = "//*[text()='Submit']")
	static WebElement btnSubmit;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;
	@FindBy(xpath = "//*[@id=\"btnClose\"]") // *[text()='Back']
	static WebElement btnBackFormA;
	@FindBy(xpath = "//*[text()='Save']")
	static WebElement btnSave;
	@FindBy(xpath = "//*[text()='Complete']")
	static WebElement btnComplete;
	@FindBy(xpath = "//*[text()='Close']")
	static WebElement btnClose;
	
	@FindBy(xpath = "//*[text()='Amend']")
	static WebElement btnAmend;
	@FindBy(xpath = "//*[text()='Print MDH']")
	static WebElement btnPrintMDH;
	@FindBy(xpath = "//*[text()='Approve']")
	static WebElement btnApprove;
	@FindBy(xpath = "//*[text()='Print Arrival Departure Report']")
	static WebElement btnPrintArrivalDepartureReport;
	@FindBy(xpath = "//*[text()='Reject']")
	static WebElement btnReject;
	@FindBy(xpath = "//*[text()='Return for Correction']")
	static WebElement btnReturnForCorrection;
	@FindBy(xpath = "//*[text()='Print FAL1']")
	static WebElement btnPrintFAL1;

	@FindBy(id = "txtReqNumber")
	static WebElement txtReqNumber_SAD;
	@FindBy(xpath = "//*[@id=\"List_ShipDeclJourPopLs_0_VesselNumber\"]/a")
	static WebElement txtShpIdnNo;
	@FindBy(id = "txtVonNo")
	static WebElement txtVonNo;
	@FindBy(xpath = "//*[@id=\"List_ShipDeclJourPopLs_0_ShipCallNo\"]/div")
	static WebElement txtShipCalNo;
	@FindBy(xpath = "//*[@id=\"List_ShipDeclJourPopLs_0_VesselName\"]/div")
	static WebElement txtShipName;

	public SAD(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // This initElements method will create all WebElements

	}

	public static void switchParentFrame(String testData) {

		try {
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void navigateToURL(String testData) {

		try {
			OR.driver.get(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	@FindBy(id="userNameInput")
	static WebElement txtUserName;
	@FindBy(id="passwordInput")
	static WebElement txtpasswordInput;
	@FindBy(id="submitButton")
	static WebElement  btnsubmitButton;
	
	public static void setLoginId(String testData) {
		try {
//			liLogin.click();
//			// txtLoginId.clear();
//			txtLoginId.sendKeys(testData);
			
//			UAT
			txtUserName.clear();
			txtUserName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPassword(String testData) {
		try {
			Thread.sleep(500);
			// txtPassword.clear();
//			txtPassword.sendKeys(testData);
			txtpasswordInput.clear();
			txtpasswordInput.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickLoginBtn(String testData) {
		try {
//			btnLoginInUcustoms.click();
//			UAT
			btnsubmitButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSignOut(String testData) {
		try {

			OR.driver.switchTo().defaultContent();
			liSignOut.click();
			// OR.driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ----------------------------Ship Arrival Declaration-------------------------
	public static void clickShipCargoMenu(String testData) {
		try {
			menuShipCargo.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickShipClearanceSubMenu(String testData) {
		try {
			subMenuShipClearance.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickShipArrivalDecNestedSubMenu(String testData) {
		try {

			nestedSubMenuShipArrivalDeclarations.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickNewSAD(String testData) throws Exception {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");

			btnNew.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickOpenSAD(String testData) throws Exception {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");

			lnkOpenSAD.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickDeleteSAD(String testData) throws Exception {
		try {
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
			chkSAD_lst.click();
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			btnDelete.click();
			OR.driver.switchTo().alert().accept();// To click on the 'OK' button of the alert.
			// OR.driver.switchTo().alert().dismiss();// To click on the 'Cancel' button of
			// the alert.

		} catch (Exception e) {
			e.getMessage();
		}
	}

	// ----------------------FAL 1 screen form filling----------

	public static void clickShpID(String testData) {
		try {
			btnShpID.click();
			OR.driver.switchTo().frame(frame_ShipDeclJourPopLsPg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNameOfShip(String testData) {
		try {
			txtNameOfShip.sendKeys(testData); // CREW BOAT8239
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	
	public static void setJourneyNo(String testData) {
		try {
			// CargoImport.impJourneyNo=
			// txtJrnNo.sendKeys("CAR-JRN-B18-09-2019-000082");
			txtJrnNo.sendKeys(CargoImport.JourneyNo); // CAR-JRN-B18-12-2018-001511
			txtSCIdNo.sendKeys(CargoImport.vesselId);
			txtImoNo.sendKeys(CargoImport.iMONumber);
			txtShipName.sendKeys(CargoImport.shipName);
			txtShipCalNo.sendKeys(CargoImport.shipCallNo);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSearch_btn(String testData) {
		try {
			btnSearch.click();

			ShipIdentificationNo = txtShpIdnNo.getText();
			// VoyageNumber=txtVonNo.getText();
			ShipCallNumber = txtShipCalNo.getText();
			ShipName = txtShipName.getText();

			System.out.println("Ship Identification No: " + ShipIdentificationNo);
			System.out.println("Ship Call No: " + ShipCallNumber);
			System.out.println("Ship Call Number: " + ShipName);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickShipIDno(String testData) {
		try {
			lnkShipID.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNameOfMaster(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,700)");
			txtNameofMaster.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectTyoeOfVoyage(String testData) {
		try {
			Select select = new Select(ddlTypeOfVoy);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectPositionOfShipinPort(String testData) {
		try {
			Select select = new Select(ddlPositionOfShipInThePort);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setBurthen(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");

			txtBurthen.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setMeanDraft(String testData) {
		try {
			txtMeanDraft.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectPurposeOfCall(String testData) {
		try {
			Select select = new Select(ddlPurCall);
			select.selectByVisibleText(testData);

			if ("OTHERS".equals(testData)) {
				txtOthrPurCall.sendKeys(testData);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setBriefDesOfCargo(String testData) {
		try {
			txtBrfDesc.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setBriefParticularsOfVoyage(String testData) {
		try {
			txtBrfDescVoy.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setShipDescription(String testData) {
		try {
			txtShpDesc.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setRemarks(String testData) {
		try {
			txtRemarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickAcknowledge(String testData) {
		try {
			WebElement checkbox = ChkAcknoeledge;
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickCreate_btn(String testData) {
		try {
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSave_btn(String testData) {
		try {

			btnSave.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickBack_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,5000)");
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// -----------------FAL2
	public static void clickCreate_FAL2(String testData) {
		try {
			SADRequestNumber = txtReqNumber_SAD.getText();
			System.out.println("SAD Request Number: " + SADRequestNumber);

			linkRepository.click();
			lnkFAL2.click();
			OR.driver.switchTo().frame(frame_FAL2);
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickOpenHBL(String testData) {
		try {

			if ("Bill of Lading No.".equals(lnkBLNo.getText())
					|| "No records available".equals(txtNoRecords.getText())) {
				linkOpenHBL.click();
				if ("Item HS Code".equals(lnkItemHSCoad.getText())) {
					JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
					jse.executeScript("window.scrollBy(0,700)");
					linkOpenHBLL.click();
					jse.executeScript("window.scrollBy(0,700)");
					btnBack.click();
				} else {
					btnBack.click();
				}
				btnBack.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNewRemainOnBoardBL(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			btnNewRemainOnBoar.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setBLNo(String testData) {
		try {
			txtBolNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setHSCode(String testData) {
		try {
			txtHScode.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDescriptionGoods(String testData) {
		try {
			txtDescOfGoods.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setContainerID(String testData) {
		try {
			txtContID.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setMrksAndNo(String testData) {
		try {
			txtMrks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPkgQuantity(String testData) {
		try {
			txtPkgNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPkgType(String testData) {
		try {
			txtTypeOfPack.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setGrossWeight(String testData) {
		try {
			txtGrossweight.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setUOM(String testData) {
		try {
			txtUOM.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortOfOrigin(String testData) {
		try {
			txtPortofLanding.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortOfDischarge(String testData) {
		try {
			txtPortOfDischarge.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsSplit(String testData) {
		try {
			WebElement checkbox = chkIsSplitHouseBill;
			if (!checkbox.isSelected()) {
				checkbox.click();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickComplete_btn(String testData) {
		try {
			btnComplete.click();
			btnBack.click();
			OR.driver.switchTo().parentFrame();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// --------FAL 3
	public static void clickCreate_FAL3(String testData) {
		try {
			linkRepository.click();
			lnkFAL3.click();
			OR.driver.switchTo().frame(frame_FAL3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPeriodofStay(String testData) {
		try {
			txtPeriodofStay.sendKeys(testData);
			btnCreate.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNillStores(String testData) {
		try {
			WebElement checkbox = ChkNillStores;
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNew_ShipStore(String testData) {
		try {
			btnENew.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNameArticle(String testData) {
		try {
			txtNameArticle.sendKeys(testData);
			autoCompleteDiv.click();
			if ("OTHERS".equals(testData)) {
				txtNAOthers.sendKeys(testData);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLocationOnBoard(String testData) {
		try {
			txtLocBoard.sendKeys(testData);
			autoCompleteDiv.click();
			if ("OTHERS".equals(testData)) {
				txtLBOthers.sendKeys(testData);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setQuantity(String testData) {
		try {
			txtQuantity.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setGrossWeightUOM(String testData) {
		try {
			ddlGrossWeightUOM.sendKeys(testData);
			autoCompleteDiv.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// --------FAL 4
	public static void clickCreate_FAL4(String testData) {
		try {
			linkRepository.click();
			lnkFAL4.click();
			OR.driver.switchTo().frame(frame_FAL4);
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNillEffects(String testData) {
		try {
			WebElement checkbox = ChkNilEffects;
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNewCrewsEffects(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			btnNewCrew.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setFamilyName(String testData) {
		try {
			OR.driver.switchTo().frame(frame_FAL4CrewEffects);
			txtFamilyName.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setRankorRating(String testData) {
		try {

			txtRankorRating.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setGoodsDescription(String testData) {
		try {

			txtGoodsDescription.sendKeys(testData);
			autoCompleteDiv.click();
			if ("OTHERS".equals(testData)) {
				txtothdoc.sendKeys(testData);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickClose_btn(String testData) {
		try {
			btnClose.click();
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// -----------FAL 5
	public static void clickCreate_FAL5(String testData) {
		try {
			linkRepository.click();
			lnkFAL5.click();
			OR.driver.switchTo().frame(frame_FAL5);
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickAddCrew(String testData) {
		try {
			btnAdd.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setGivenName(String testData) {
		try {
			txtFmlyName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setRank(String testData) {
		try {
			txtRank.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setCountry(String testData) {
		try {
			txtCountry.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectTravelDoc(String testData) {
		try {
			Select select = new Select(ddlTravelDocument);
			select.selectByVisibleText(testData);

			if ("Others".equals(testData)) {
				txtothdoc.sendKeys(testData);
			} else if ("Passport/ID".equals(testData)) {
				txtCountrypt.sendKeys("Singapore");
				autoCompleteDiv.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDocNo(String testData) {
		try {
			txtDocNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectDate(String testData) {
		try {
			Select year = new Select(year_datepicker);
			year.selectByVisibleText(testData);
			Select month = new Select(month_datepicker);
			month.selectByVisibleText("January");
			select_date.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDOBDate(String testData) {
		try {
			txtDOBDatePicker.click();
			selectDate(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setBirthPlace(String testData) {
		try {
			txtBirthPlace.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDocIssueDate(String testData) {
		try {
			txtIssueDateDatePicker.click();
			selectDate(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDocExpiryDate(String testData) {
		try {
			txtExpiryDateDatePicker.click();
			selectDate(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setSeamanBookNo(String testData) {
		try {
			txtBookNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setValidDate(String testData) {
		try {
			txtValidDateDatePicker.click();
			selectDate(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ----------------FAL 6
	public static void clickCreate_FAL6(String testData) {
		try {
			linkRepository.click();
			lnkFAL6.click();
			OR.driver.switchTo().frame(frame_FAL6);
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNilPassengers(String testData) {
		try {
			chkNilPassengers.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNewPassenger(String testData) {
		try {
			btnNew.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setFamilyName_GivenName(String testData) {
		try {
			txtFamilyName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNationality(String testData) {
		try {
			txtNationality.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPlaceOfBirth(String testData) {
		try {
			txtPOB.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectTravelDT(String testData) {
		try {
			Select select = new Select(txtTDT);
			select.selectByVisibleText(testData);
			if ("Others".equals(testData)) {
				txtothdoc.sendKeys(testData);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDocumentNo(String testData) {
		try {
			txtDocumentNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDocumentIssueDate(String testData) {
		try {
			txtDIDDatePicker.click();
			selectDate(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setDocumentExpiryDate(String testData) {
		try {
			txtDEDDatePicker.click();
			selectDate(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickTransitPassenger(String testData) {
		try {
			WebElement checkbox = rboTransitPassYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rboTransitPassNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortOfEmbarkation(String testData) {
		try {
			txtPOE.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortOfDisembarkation(String testData) {
		try {
			txtPOD.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ------------FAL7---------------
	public static void clickCreate_FAL7(String testData) {
		try {
			linkRepository.click();
			lnkFAL7.click();
			OR.driver.switchTo().frame(frame_FAL7);
			btnCreate.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNilDGGoods(String testData) {
		try {
			chkNilDGGoods.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickISArmSecOnBoard(String testData) {
		try {
			chkISArmSecOnBoard.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickAssociateDGgoods(String testData) {
		try {
			browsebutton.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickDGGoods(String testData) {
		try {
			OR.driver.switchTo().frame(frame_FAL7DG);
			ID1EAAAABA.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSaveSelected(String testData) {
		try {

			buttonID1EAAAABA.click();
			// OR.driver.switchTo().defaultContent();
			// OR.driver.switchTo().frame("contentframe");
			// OR.driver.switchTo().frame(frame_FAL7);
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickOpenDG(String testData) {
		try {
			// txtRemarks.sendKeys("test");
			// JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			// jse.executeScript("window.scrollBy(0,300)");
			// OR.driver.findElement(By.id("chk_ID2E2_0")).click();
			// OR.driver.findElement(By.id("btnDelete")).click();
			// OR.driver.switchTo().alert().accept();
			// *[@id="List_SCDGGoodDetailsList_0_ID1EAABDAA"]/a/i
			List_SCDGGoodDetailsList_0_ID1EAABDAA.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setMarksandNumbers(String testData) {
		try {
			txtMarksandNumbers.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setContainerIDNo(String testData) {
		try {
			txtContainerIDNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setVehicleRegistrationNo(String testData) {
		try {
			txtVehicleRegistrationNo.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNoOfPackages(String testData) {
		try {
			txtNoofPackages.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectPackageTypeId(String testData) {
		try {

			Select select = new Select(ddlPackageTypeId);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setProperShippingName(String testData) {
		try {
			txtProperShippingName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setProperShippingDescription(String testData) {
		try {
			txtProperShippingDescription.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectIMDGClass(String testData) {
		try {
			Select select = new Select(txtIMDGClass);
			select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setUNNo(String testData) {
		try {
			txtUNNo.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setBPAGroup(String testData) {
		try {
			txtBPAGroup.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setClass7ScheduleNumber(String testData) {
		try {
			txtClass7ScheduleNumber.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setContrlndEmergencyTemp(String testData) {
		try {
			txtContrlndEmergencyTemp.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setSubsidiaryRisks(String testData) {
		try {
			txtSubsidiaryRisks.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setFlashPoint(String testData) {
		try {
			txtFlashPoint.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setMarinePollutant(String testData) {
		try {
			txtMarinePollutant.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNetWeight(String testData) {
		try {
			txtNetWeight.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectGrossWeightUOM(String testData) {
		try {
			ddlGrossWeightUOM.click();
			autoCompleteDiv.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setEmS(String testData) {
		try {
			txtEmS.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setStowagePositiononBoard(String testData) {
		try {
			txtStowagePositiononBoard.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortofDischarge(String testData) {
		try {
			txtPortofDischarge.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ------------Last10Port---------------

	public static void clickCreate_Last10Port(String testData) {
		try {
			linkRepository.click();
			lnkLast10Port.click();
			OR.driver.switchTo().frame(frame_10PortofCall);
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickMaidenVouage(String testData) {
		try {

			WebElement checkbox = chckVooy;
			if (!checkbox.isSelected()) {
				checkbox.click();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setReason(String testData) {
		try {
			txtreason.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNewPortOfCall(String testData) {
		try {
			new1.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLocationName(String testData) {
		try {
			txtlocationname.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickDateOfArrival(String testData) {
		try {
			txtarrivalDatePicker.click();
			btnToday.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectArrivalHrs(String testData) {
		try {
			OR.select(ddlArrivalHrs, testData);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectArrivalMin(String testData) {
		try {
			Select select = new Select(ddlArrivalMins);
			select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickDateOfDeparture(String testData) {
		try {
			txtdepartureDatePicker.click();
			btnToday.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectDepartureHrs(String testData) {
		try {
			Select select = new Select(ddlDepartureHrs);
			select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectDepartureMins(String testData) {
		try {
			Select select = new Select(ddlDepartureMins);
			select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectISPS(String testData) {
		try {
			Select select = new Select(ddlISPS);
			select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ------------Immigration--------
	public static void clickCreate_Immigration(String testData) {
		try {
			linkRepository.click();
			lnkImmigration.click();
			OR.driver.switchTo().frame(frame_Immigration);

			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setApplicantRemarks(String testData) {
		try {
			txtApplicantRemarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickUploadLnkRepo_Immi(String testData) {
		try {
			lnkImmigrationClearance.click();
			lnkUploadDoc.click();
			OR.driver.switchTo().frame(frame_FTPUploadDocs);
Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void uploadDoc(String testData) {
		try {
Thread.sleep(2000);
			Select select = new Select(ddlDocumentTypes);
			select.selectByVisibleText(testData);
			if ("✘-O-OTHERS".equals(testData)) {
				txtOther.sendKeys("Other Documents");
			}
			file_upload.click();
			OR.upload();
			Thread.sleep(2000);
			// imgExpiryDate.click();
			// selectDate("2030");
			txtDocumentReferenceNo.sendKeys("DPLE12");
			txtDescription.sendKeys("Created by Automation");
			btnUpload.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickClosePopUp(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,5000)");
			OR.driver.switchTo().parentFrame();
			btnClosePopUp.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}

	}

	// =================PKP---------
	public static void clickCreate_PKP(String testData) {
		try {
			linkRepository.click();
			lnkPKP.click();
			OR.driver.switchTo().frame(frame_PKP);
			// btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortOfSSCECIssuance(String testData) {
		try {
			txtPortName.sendKeys(testData);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectExpiryDateOfSSCEC(String testData) {
		try {
			txtExpiryDateDatePicker.click();// *[@id="txtExpiryDateDatePicker"]
			selectDate(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setHealthStatusofCrew(String testData) {
		try {
			txtCrewRem.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setHealthStatusOfPassenger(String testData) {
		try {
			txtPassangerRem.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setApplicantRmks(String testData) {
		try {
			txtApplicantRem.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setWharf(String testData) {
		try {
			txtWharf.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setStowawaysDescription(String testData) {
		try {
			txtStowawaysDescription.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ====================Health ++++++++++++++++++++
	public static void clickLnkHealthDetails(String testData) {
		try {
			vesselAdviseNo = txtAdviseNo.getText();
			System.out.println("PKP vessel Advise No: " + vesselAdviseNo);
			lnkRepoPKP.click();
			lnkHealthDetails.click();
			OR.driver.switchTo().frame(frame_HealthDetails);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickPlugFever(String testData) {
		try {
			WebElement checkbox = rdPlugFeverYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdPlugFeverNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsPlaugeOccured(String testData) {
		try {
			WebElement checkbox = rdIsPlaugeOccuredYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdIsPlaugeOccuredNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickAnyPersonDiedOnBoard(String testData) {
		try {

			WebElement checkbox = rdAnyPersonDiedOnBoardYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdAnyPersonDiedOnBoardNo.click();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickInfectiousDiseses(String testData) {
		try {
			WebElement checkbox = rdInfectiousDisesesYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdInfectiousDisesesNo.click();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSickPersonOnBoard(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,700)");

			WebElement checkbox = rdSickPersonOnBoardYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdSickPersonOnBoardNo.click();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickInfectionConditions(String testData) {
		try {

			WebElement checkbox = rdInfectionConditionsYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdInfectionConditionsNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSanityMeasuresApplied(String testData) {
		try {
			WebElement checkbox = rdSanityMeasuresAppliedYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdSanityMeasuresAppliedNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickStowawaysFound(String testData) {
		try {
			WebElement checkbox = rdStowawaysFoundYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdStowawaysFoundNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSickAnimalOnboard(String testData) {
		try {
			WebElement checkbox = rdSickAnimalOnboardYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdSickAnimalOnboardNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickCompleteHD(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			btnComplete.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ============VACCINATION DETAILS
	public static void clickLnkVaccinationDetails(String testData) {
		try {
			lnkRepoPKP.click();
			lnkCrewVaccinationDetails.click();
			OR.driver.switchTo().frame(frame_SCVaccination);
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickNewVaccDetails(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			btnNew.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setFName(String testData) {
		try {
			txtFname.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setRate(String testData) {
		try {
			txtRate.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickUploadLnkRepo_PKP(String testData) {
		try {
			lnkRepoPKP.click();
			lnkUploadDoc.click();
			OR.driver.switchTo().frame(frame_FTPUploadDocs);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ------------PANS--------
	public static void clickCreate_PANS(String testData) {
		try {
			linkRepository.click();
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,200)");
			lnkPANS.click();
			OR.driver.switchTo().frame(frame_PANS);
			// btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPortFacility(String testData) {
		try {
			txtPortFacility.sendKeys(testData);
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,300)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectPortClearanceFor(String testData) {
		try {
			Select select = new Select(ddlPortCLfor);
			select.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectSecLevelOnboardShip(String testData) {
		try {
			Select select = new Select(txtSecLevelOnboardShip);
			select.selectByVisibleText(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickHasAnyStowawaysOnBoard(String testData) {
		try {
			WebElement checkbox = rdbYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdbNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setShipSecuOfficerName(String testData) {
		try {
			txtShipSecuOfficerName.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPhoneNumber(String testData) {
		try {
			txtPhoneNumber.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setEmail(String testData) {
		try {
			txtEmail.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setMMSINumber(String testData) {
		try {
			txtMMSINumber.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setNameAnchMarineFacility(String testData) {
		try {
			txtNameAnchMarineFacility.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLatitude1(String testData) {
		try {
			txtLatitude1.sendKeys(testData);
			;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLatitude2(String testData) {
		try {
			txtLatitude2.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLatitude3(String testData) {
		try {
			txtLatitude3.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickLatiDirection(String testData) {
		try {
			WebElement checkbox = rdLatiDirectionS;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdLatiDirectionN.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setOtherParticulars(String testData) {
		try {
			txtOtherParticulars.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLongitude1(String testData) {
		try {

			txtLongitude1.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLongitude2(String testData) {
		try {
			txtLongitude2.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLongitude3(String testData) {
		try {
			txtLongitude3.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickLongitudeDirection(String testData) {
		try {
			rdLongDirection.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickProhGdUnderUNSecCouncil(String testData) {
		try {

			WebElement checkbox = rbtnResYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbtnResNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setProhibitedGoods(String testData) {
		try {
			txtProhibitedGoods.sendKeys(testData);
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,400)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsShipSecurityInterim(String testData) {
		try {

			WebElement checkbox = rbtnCertYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbtnCertNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsArriveNonCompliantPort(String testData) {
		try {

			WebElement checkbox = rbtnFacilityYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbtnFacilityNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickAckDeclaration(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			chkDeclaration.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ------------JLM/ISPS/PAN/3
	public static void clickJLM_ISPS_PAN_3(String testData) {
		try {
			lnkPANSecurityRepo.click();
			lnkJLM_ISPS_PAN3.click();
			OR.driver.switchTo().frame(frame_JlmIspaPAN3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickDoSIssued1(String testData) {
		try {

			WebElement checkbox = rdFacilityYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdFacilityNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickVesselWatch2(String testData) {
		try {
			WebElement checkbox = rdStayYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdStayNo.click();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickCrewasperCrewList3(String testData) {
		try {

			WebElement checkbox = rdCrewYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdCrewNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickStowawaysCheck4(String testData) {
		try {

			WebElement checkbox = rdOnordYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdOnbordNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickCargoManifest5(String testData) {
		try {

			WebElement checkbox = rdNmaniYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdManiNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickStoragePlan6(String testData) {
		try {

			WebElement checkbox = rdAvilaYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdAvilaNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickStores7(String testData) {
		try {

			WebElement checkbox = rdReqYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdReqNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickAvailableRecords8(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			WebElement checkbox = rdRecYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdRecNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickDangerousGoods9(String testData) {
		try {
			WebElement checkbox = rdDengYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rdDengNo.click();
			}
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setIMDGCodeClass10(String testData) {
		try {
			textboxImdcode.sendKeys(testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickProhibitedGoods11(String testData) {
		try {
			WebElement checkbox = rdOnboardYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
			}

			rdResolNo.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setProhibitedGoodsDetails12(String testData) {
		try {
			textboxonboard.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ---------JLM/ISPS/PAN/4
	public static void clickJLM_ISPS_PAN_4(String testData) {
		try {
			lnkPANSecurityRepo.click();
			lnkJLM_ISPS_PAN4.click();
			OR.driver.switchTo().frame(frame_JlmIspsPANS4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickLastPortOfCall1(String testData) {
		try {
			WebElement checkbox = rbLastPortOfCallYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbLastPortOfCallNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsportCalIsps2(String testData) {
		try {
			WebElement checkbox = rbIsportCalIspsYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbOstayNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickImposAtLastPort3(String testData) {
		try {
			WebElement checkbox = rbImposAtLastPortYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
				txtDetails.sendKeys(testData);
			} else {
				rbImposAtLastPortNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsYouConSSA4(String testData) {
		try {
			WebElement checkbox = rbIsYouConSSAYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsYouConSSAno.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsSspOnBoard5(String testData) {
		try {

			WebElement checkbox = rbIsSspOnBoardYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsSspOnBoardNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsSspImplimented6(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");
			WebElement checkbox = rbIsSspImplimentedYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsSspOnBoardNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// CREW PARTICULARS
	public static void clickIsShipCrewSso7(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");
			WebElement checkbox = rbIsShipCrewSsoyes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsShipCrewSsoNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsCrewAwarness8(String testData) {
		try {
			WebElement checkbox = rbIsCrewAwarnessYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsCrewAwarnessNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsfullgangway9(String testData) {
		try {
			WebElement checkbox = rbIsfullgangwayYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsfullgangwayNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsUnlawfulboarding10(String testData) {
		try {
			WebElement checkbox = rbIsUnlawfulboardingYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsUnlawfulboardingNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsstowawayconducted11(String testData) {
		try {
			WebElement checkbox = rbIsstowawayconductedYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsstowawayconductedNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickIsstowawayFound12(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,1000)");

			WebElement checkbox = rbIsstowawayFoundYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsstowawayFoundNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// CARGO PARTICULARS
	public static void clickIsNoLoadinglasport13(String testData) {
		try {
			WebElement checkbox = rbIsNoLoadinglasportYes;
			if (!checkbox.isSelected()) {
				checkbox.click();
			} else {
				rbIsNoLoadinglasportNo.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// Upload
	public static void clickUploadLnkRepo_PANS(String testData) {
		try {
			lnkPANSecurityRepo.click();
			lnkUploadDoc.click();
			OR.driver.switchTo().frame(frame_FTPUploadDocs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ------------FORM A--------
	public static void clickCreate_FormA(String testData) {
		try {
			linkRepository.click();
			lnkFormA.click();
			OR.driver.switchTo().frame(frame_FormA);
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickAssociateBL(String testData) {
		try {
			btnAss.click();
			OR.driver.switchTo().frame(frame_FormA_BOL);
			chk_ID1EAAAABA_0.click();
			btnSaveID1EAAAABA.click();
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickComplete_FormA(String testData) {
		try {
			btnComplete.click();
			btnBackFormA.click();
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ------------Upload--------
	public static void clickUploadDocument_FLA1(String testData) {
		try {
			linkRepository.click();
			lnkUploadDoc.click();
			OR.driver.switchTo().frame(frame_FTPUploadDocs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	// ----------------Submit FAL1
	public static void clickSubmit_btn(String testData) {
		try {

			btnSubmit.click();
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

}
