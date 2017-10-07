package com.domeastudio.mappingo.servers.microservice.spatialpdm.service.impl;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.*;
import com.domeastudio.mappingo.servers.microservice.spatialpdm.repository.*;
import com.domeastudio.mappingo.servers.microservice.spatialpdm.service.DataDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class DataDictionaryImpl implements DataDictionary {
    @Autowired
    private ActivityTypeRepository activityTypeRepository;
    @Autowired
    private AlarmSystemRepository alarmSystemRepository;
    @Autowired
    private AppurtenanceTypeRepository appurtenanceTypeRepository;
    @Autowired
    private AspectCodeRepository aspectCodeRepository;
    @Autowired
    private BendAngleRepository bendAngleRepository;
    @Autowired
    private BreakePointRateRepository breakePointRateRepository;
    @Autowired
    private CableCoatingRepository cableCoatingRepository;
    @Autowired
    private CableSizeRepository cableSizeRepository;
    @Autowired
    private CableTypeRepository cableTypeRepository;
    @Autowired
    private CasingFillMaterialRepository casingFillMaterialRepository;
    @Autowired
    private CasingSealTypeRepository casingSealTypeRepository;
    @Autowired
    private CasingTypeRepository casingTypeRepository;
    @Autowired
    private CatalogRepository catalogRepository;
    @Autowired
    private ClassTypeRepository classTypeRepository;
    @Autowired
    private ClosureTypeRepository closureTypeRepository;
    @Autowired
    private CoatingConditionRepository coatingConditionRepository;
    @Autowired
    private CoatingMaterialRepository coatingMaterialRepository;
    @Autowired
    private CoatingSourceRepository coatingSourceRepository;
    @Autowired
    private ComeFromFlagRepository comeFromFlagRepository;
    @Autowired
    private CompanyTypeRepository companyTypeRepository;
    @Autowired
    private ContactTypeRepository contactTypeRepository;
    @Autowired
    private ContractTypeRepository contractTypeRepository;
    @Autowired
    private ControlPointTypeRepository controlPointTypeRepository;
    @Autowired
    private CoodiPrecisionRepository coodiPrecisionRepository;
    @Autowired
    private CorrosionDegreeRepository corrosionDegreeRepository;
    @Autowired
    private CPPowerWorkTypeRepository cpPowerWorkTypeRepository;
    @Autowired
    private CPStatusRepository cpStatusRepository;
    @Autowired
    private CrackTypeRepository crackTypeRepository;
    @Autowired
    private CrossingMethodRepository crossingMethodRepository;
    @Autowired
    private CrossingObjectRepository crossingObjectRepository;
    @Autowired
    private CrossingStatusRepository crossingStatusRepository;
    @Autowired
    private CurrentTypeRepository currentTypeRepository;
    @Autowired
    private DataResolutionRepository dataResolutionRepository;
    @Autowired
    private DataSourceRepository dataSourceRepository;
    @Autowired
    private DataStatusRepository dataStatusRepository;
    @Autowired
    private DaysOfWeekRepository daysOfWeekRepository;
    @Autowired
    private DefectiveConditionRepository defectiveConditionRepository;
    @Autowired
    private DentTypeRepository dentTypeRepository;
    @Autowired
    private DetectionTypeRepository detectionTypeRepository;
    @Autowired
    private DisasterTypeRepository disasterTypeRepository;
    @Autowired
    private DisturbanceRepository disturbanceRepository;
    @Autowired
    private EasyAreaTypeRepository easyAreaTypeRepository;
    @Autowired
    private ElbowAngleRepository elbowAngleRepository;
    @Autowired
    private ElbowTypeRepository elbowTypeRepository;
    @Autowired
    private EmergencyServiceRepository emergencyServiceRepository;
    @Autowired
    private EvaluationResultsRepository evaluationResultsRepository;
    @Autowired
    private FailureModeRepository failureModeRepository;
    @Autowired
    private FailureTypeRepository failureTypeRepository;
    @Autowired
    private FaultLineDirectionRepository faultLineDirectionRepository;
    @Autowired
    private FaultTypeRepository faultTypeRepository;
    @Autowired
    private FcrepStatusRepository fcrepStatusRepository;
    @Autowired
    private FeatureClassRepository featureClassRepository;
    @Autowired
    private FeatureTypeRepository featureTypeRepository;
    @Autowired
    private FittingMaterialRepository fittingMaterialRepository;
    @Autowired
    private FloodClassRepository floodClassRepository;
    @Autowired
    private FloodProMaterialTypeRepository floodProMaterialTypeRepository;
    @Autowired
    private FloodProTypeRepository floodProTypeRepository;
    @Autowired
    private ForignPipeTypeRepository forignPipeTypeRepository;
    @Autowired
    private GalvanicAnodeMaterialRepository galvanicAnodeMaterialRepository;
    @Autowired
    private GalvanicAnodeWeightRepository galvanicAnodeWeightRepository;
    @Autowired
    private GBBackFillMaterialRepository gbBackFillMaterialRepository;
    @Autowired
    private GBStructureRepository gbStructureRepository;
    @Autowired
    private GeoRiskMeasureRepository geoRiskMeasureRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private HCATypeRepository hcaTypeRepository;
    @Autowired
    private HydroTypeRepository hydroTypeRepository;
    @Autowired
    private InspectionMethodRepository inspectionMethodRepository;
    @Autowired
    private IntegrityProposalRepository integrityProposalRepository;
    @Autowired
    private InternalExternalRepository internalExternalRepository;
    @Autowired
    private JointCoatingTypeRepository jointCoatingTypeRepository;
    @Autowired
    private LandUseTypeRepository landUseTypeRepository;
    @Autowired
    private LifeCycleRepository lifeCycleRepository;
    @Autowired
    private LineTypeRepository lineTypeRepository;
    @Autowired
    private ManagerStatusRepository managerStatusRepository;
    @Autowired
    private MarkerStatusRepository markerStatusRepository;
    @Autowired
    private MarkerTypeRepository markerTypeRepository;
    @Autowired
    private MeaConPointGradeRepository meaConPointGradeRepository;
    @Autowired
    private MeaConPointTypeRepository meaConPointTypeRepository;
    @Autowired
    private MediaTypeRepository mediaTypeRepository;
    @Autowired
    private MediumTypeRepository mediumTypeRepository;
    @Autowired
    private MetalLossTypeRepository metalLossTypeRepository;
    @Autowired
    private MiscCrossingTypeRepository miscCrossingTypeRepository;
    @Autowired
    private MunicipalBndryTypeRepository municipalBndryTypeRepository;
    @Autowired
    private NDTTypeRepository ndtTypeRepository;
    @Autowired
    private NSPPipeMaterialRepository nspPipeMaterialRepository;
    @Autowired
    private NSPPipeTypeRepository nspPipeTypeRepository;
    @Autowired
    private OperatingPressureRepository operatingPressureRepository;
    @Autowired
    private OperationalStatusRepository operationalStatusRepository;
    @Autowired
    private OperatorTypeRepository operatorTypeRepository;
    @Autowired
    private PatrolPeriodsRepository patrolPeriodsRepository;
    @Autowired
    private PatrolTypeRepository patrolTypeRepository;
    @Autowired
    private RepstatusRepository repstatusRepository;
    @Autowired
    private PCMDCACRepository pcmdcacRepository;
    @Autowired
    private PercentageRepository percentageRepository;
    @Autowired
    private PipeDiameterRepository pipeDiameterRepository;
    @Autowired
    private PigStructureTypeRepository pigStructureTypeRepository;
    @Autowired
    private PipeJoinTypeRepository pipeJoinTypeRepository;
    @Autowired
    private PipelineDiameterRepository pipelineDiameterRepository;
    @Autowired
    private PipeRepairRepository pipeRepairRepository;
    @Autowired
    private PipeRepMethodRepository pipeRepMethodRepository;
    @Autowired
    private PipeSeamTypeRepository pipeSeamTypeRepository;
    @Autowired
    private PipeSegMaterialRepository pipeSegMaterialRepository;
    @Autowired
    private PipeSegTypeRepository pipeSegTypeRepository;
    @Autowired
    private PowerOperatingAmpsOutRepository powerOperatingAmpsOutRepository;
    @Autowired
    private PowerOperatingVoltsOutRepository powerOperatingVoltsOutRepository;
    @Autowired
    private PowerProtectTypeRepository powerProtectTypeRepository;
    @Autowired
    private PowerRatedAmpsOutRepository powerRatedAmpsOutRepository;
    @Autowired
    private PowerRatedVoltsOutRepository powerRatedVoltsOutRepository;
    @Autowired
    private PowerTypeRepository powerTypeRepository;
    @Autowired
    private PressureRatingRepository pressureRatingRepository;
    @Autowired
    private PressureTestTypeRepository pressureTestTypeRepository;
    @Autowired
    private PressureTypeRepository pressureTypeRepository;
    @Autowired
    private PressureUnitRepository pressureUnitRepository;
    @Autowired
    private PresTestMediumRepository presTestMediumRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProjectTypeRepository projectTypeRepository;
    @Autowired
    private QualityRatingRepository qualityRatingRepository;
    @Autowired
    private RailRoadTypeRepository railRoadTypeRepository;
    @Autowired
    private ReducerSizeRepository reducerSizeRepository;
    @Autowired
    private ReducerTypeRepository reducerTypeRepository;
    @Autowired
    private RepairLanTypeRepository repairLanTypeRepository;
    @Autowired
    private RegionCompanyRepository regionCompanyRepository;
    @Autowired
    private RepairMethodTypeRepository repairMethodTypeRepository;
    @Autowired
    private RepairStatusRepository repairStatusRepository;
    @Autowired
    private ResLocationRepository resLocationRepository;
    @Autowired
    private RiskGradeRepository riskGradeRepository;
    @Autowired
    private RiskLevelRepository riskLevelRepository;
    @Autowired
    private RiskMeasureRepository riskMeasureRepository;
    @Autowired
    private RiskTypeRepository riskTypeRepository;
    @Autowired
    private RoadTypeRepository roadTypeRepository;
    @Autowired
    private ROWPermitTypeRepository rowPermitTypeRepository;
    @Autowired
    private ROWTypeRepository rowTypeRepository;
    @Autowired
    private RsikFactorRepository rsikFactorRepository;
    @Autowired
    private SeriesTypeRepository seriesTypeRepository;
    @Autowired
    private SheetTypeRepository sheetTypeRepository;
    @Autowired
    private SignTypeRepository signTypeRepository;
    @Autowired
    private SlopeCodeRepository slopeCodeRepository;
    @Autowired
    private SoilDrainageRepository soilDrainageRepository;
    @Autowired
    private SoilMICRepository soilMICRepository;
    @Autowired
    private SoilStabilityRepository soilStabilityRepository;
    @Autowired
    private SoilTestResultsRepository soilTestResultsRepository;
    @Autowired
    private SoilTopographyRepository soilTopographyRepository;
    @Autowired
    private SoilTypeRepository soilTypeRepository;
    @Autowired
    private SoilUseTopographyRepository soilUseTopographyRepository;
    @Autowired
    private StrainDirectionTypeRepository strainDirectionTypeRepository;
    @Autowired
    private StrengthRatingRepository strengthRatingRepository;
    @Autowired
    private StructureTypeRepository structureTypeRepository;
    @Autowired
    private SubSystemTypeRepository subSystemTypeRepository;
    @Autowired
    private SystemMetaRepository systemMetaRepository;
    @Autowired
    private SystemPrincipleRepository systemPrincipleRepository;
    @Autowired
    private SystemTypeRepository systemTypeRepository;
    @Autowired
    private TapFlowDirectionRepository tapFlowDirectionRepository;
    @Autowired
    private TapSizeRepository tapSizeRepository;
    @Autowired
    private TapTypeRepository tapTypeRepository;
    @Autowired
    private TeeSizeRepository teeSizeRepository;
    @Autowired
    private UseAvgRateRepository useAvgRateRepository;
    @Autowired
    private TeeTypeRepository teeTypeRepository;
    @Autowired
    private UseMaxRateRepository useMaxRateRepository;
    @Autowired
    private UtilityPointTypeRepository utilityPointTypeRepository;
    @Autowired
    private UtilityTypeRepository utilityTypeRepository;
    @Autowired
    private ValveFunctionRepository valveFunctionRepository;
    @Autowired
    private ValveOperatorTypeRepository valveOperatorTypeRepository;
    @Autowired
    private ValvePositionRepository valvePositionRepository;
    @Autowired
    private ValveTypeRepository valveTypeRepository;
    @Autowired
    private WallThicknessRepository wallThicknessRepository;
    @Autowired
    private WeeksPerYearRepository weeksPerYearRepository;
    @Autowired
    private WeldConditionRepository weldConditionRepository;
    @Autowired
    private WeldDefTypeRepository weldDefTypeRepository;
    @Autowired
    private WeldTypeRepository weldTypeRepository;
    @Autowired
    private WindDirectionRepository windDirectionRepository;
    @Autowired
    private YesNoRepository yesNoRepository;


    @Override
    public void dictionaryInitialization() {
        this.deleteDictionaryKeyValue();

        this.saveFeatureTypeEntity("BV", "球阀");
        this.saveFeatureTypeEntity("BEND", "弯头");
        this.saveFeatureTypeEntity("ATM", "固定墩");
        this.saveFeatureTypeEntity("REPPAT", "补丁");
        this.saveFeatureTypeEntity("DENTSW", "凹陷螺旋焊缝相关");
        this.saveFeatureTypeEntity("DENTML", "凹陷金属损失相关");
        this.saveFeatureTypeEntity("DENTSWML", "凹陷螺旋焊缝金属损失相关");
        this.saveFeatureTypeEntity("DENTGW", "凹陷环焊缝相关");
        this.saveFeatureTypeEntity("DENTGWSW", "凹陷环焊缝螺旋焊缝相关");
        this.saveFeatureTypeEntity("GV", "闸阀");
        this.saveFeatureTypeEntity("CSE", "套管结束");
        this.saveFeatureTypeEntity("CSS", "套管开始");
        this.saveFeatureTypeEntity("CE", "偏心套管");
        this.saveFeatureTypeEntity("CES", "偏心套管开始");
        this.saveFeatureTypeEntity("CEE", "偏心套管结束");
        this.saveFeatureTypeEntity("CEM", "偏心套管中心");
        this.saveFeatureTypeEntity("DENT", "凹陷");
        this.saveFeatureTypeEntity("SEAMWA", "双面焊异常");
        this.saveFeatureTypeEntity("SWA", "螺旋焊缝异常");
        this.saveFeatureTypeEntity("LSAWS", "焊弧缺陷");
        this.saveFeatureTypeEntity("GWA", "环焊缝异常");
        this.saveFeatureTypeEntity("SWAL", "螺旋焊缝异常");
        this.saveFeatureTypeEntity("TMA", "接触的外接金属物");
        this.saveFeatureTypeEntity("CMO", "靠近的外接金属物");
        this.saveFeatureTypeEntity("IML", "内部金属损失");
        this.saveFeatureTypeEntity("IMF", "内部制造缺陷");
        this.saveFeatureTypeEntity("EML", "外部金属损失");
        this.saveFeatureTypeEntity("IMLL", "内部金属损失长");
        this.saveFeatureTypeEntity("EMLL", "外部金属损失长");
        this.saveFeatureTypeEntity("IMFL", "内部制造缺陷长");
        this.saveFeatureTypeEntity("EMFLA", "迭片相关外部制造缺陷");
        this.saveFeatureTypeEntity("EMF", "外部制造缺陷");
        this.saveFeatureTypeEntity("EMFL", "外部制造缺陷长");
        this.saveFeatureTypeEntity("MCP", "贴近管壁的金属");
        this.saveFeatureTypeEntity("ML", "金属损失");
        this.saveFeatureTypeEntity("OTH", "其它");
        this.saveFeatureTypeEntity("UN", "未知");
        this.saveFeatureTypeEntity("MD", "管壁材质问题");
        this.saveFeatureTypeEntity("MP", "地面参考点");
        this.saveFeatureTypeEntity("TSWA", "双面焊开始");
        this.saveFeatureTypeEntity("SUP", "支撑物");
        this.saveFeatureTypeEntity("REPDSP", "修复的管节");
        this.saveFeatureTypeEntity("NWT", "标称壁厚");
        this.saveFeatureTypeEntity("RSE", "修复壳结束");
        this.saveFeatureTypeEntity("RSS", "修复壳开始");
        this.saveFeatureTypeEntity("JI", "绝缘接头");
        this.saveFeatureTypeEntity("JF", "连接法兰");
        this.saveFeatureTypeEntity("SWS", "螺旋焊缝开始");
        this.saveFeatureTypeEntity("CW", "丁字焊缝");
        this.saveFeatureTypeEntity("CRR", "十字焊缝参考");
        this.saveFeatureTypeEntity("FCF", "管箍");
        this.saveFeatureTypeEntity("TCES", "接触的套管开始");
        this.saveFeatureTypeEntity("TCEE", "接触的套管结束");
        this.saveFeatureTypeEntity("LWA", "直焊缝异常");
        this.saveFeatureTypeEntity("SEAMWF", "直焊缝缺陷");
        this.saveFeatureTypeEntity("OVA", "椭圆变形");
        this.saveFeatureTypeEntity("GOUG", "机械划痕");
        this.saveFeatureTypeEntity("OFFTAKE", "焊接支架");
        this.saveFeatureTypeEntity("PUDL", "熔焊点");
        this.saveFeatureTypeEntity("VALVE", "阀门");
        this.saveFeatureTypeEntity("FLNG", "法兰");
        this.saveFeatureTypeEntity("TEE", "三通");
        this.saveFeatureTypeEntity("TAP", "小开孔");
        this.saveFeatureTypeEntity("CB", "冷弯");
        this.saveFeatureTypeEntity("SLVE", "套袖");
        this.saveFeatureTypeEntity("WELD", "环焊缝");
        this.saveFeatureTypeEntity("MD*", "轴向影响长度在0.5米以上的管壁材质问题");

        this.saveSheetTypeEntity(1, "标准工程图");
        this.saveSheetTypeEntity(2, "DOT工程图");
        this.saveSheetTypeEntity(3, "特殊DOT工程图");
        this.saveSheetTypeEntity(4, "多线特殊DOT工程图");
        this.saveSheetTypeEntity(5, "纵剖面工程图");
        this.saveSheetTypeEntity(6, "多线纵剖面工程图");
        this.saveSheetTypeEntity(7, "高后果");
        this.saveSheetTypeEntity(8, "路权");
        this.saveSheetTypeEntity(9, "完整性图45*30");
        this.saveSheetTypeEntity(10, "工程图45*30");
        this.saveSheetTypeEntity(11, "工程图90*60");

        this.saveControlPointTypeEntity(0, "未知");
        this.saveControlPointTypeEntity(1, "GPS测量点");
        this.saveControlPointTypeEntity(2, "里程桩测量点");
        this.saveControlPointTypeEntity(3, "转角桩测量点");
        this.saveControlPointTypeEntity(99, "其它");

        this.saveLineTypeEntity(0, "未知");
        this.saveLineTypeEntity(1, "管网");
        this.saveLineTypeEntity(2, "干线");
        this.saveLineTypeEntity(3, "支线");
        this.saveLineTypeEntity(4, "连接管线");
        this.saveLineTypeEntity(5, "工业服务管线");
        this.saveLineTypeEntity(6, "储运管线");
        this.saveLineTypeEntity(7, "燃气管线");
        this.saveLineTypeEntity(8, "场站工艺管线");
        this.saveLineTypeEntity(9, "复线");
        this.saveLineTypeEntity(99, "其它");

        this.saveMediaTypeEntity(0, "未知");
        this.saveMediaTypeEntity(1, "天然气");
        this.saveMediaTypeEntity(2, "原油");
        this.saveMediaTypeEntity(3, "成品油");
        this.saveMediaTypeEntity(4, "液化石油气");
        this.saveMediaTypeEntity(5, "水");
        this.saveMediaTypeEntity(99, "其它");

        this.saveOperatorTypeEntity(0, "未知");
        this.saveOperatorTypeEntity(1, "拥有者");
        this.saveOperatorTypeEntity(2, "运行商");
        this.saveOperatorTypeEntity(3, "租借者");
        this.saveOperatorTypeEntity(99, "其它");

        this.saveProductEntity(0, "未知");
        this.saveProductEntity(1, "天然气");
        this.saveProductEntity(2, "原油");
        this.saveProductEntity(3, "汽油");
        this.saveProductEntity(4, "柴油");
        this.saveProductEntity(5, "航空煤油");
        this.saveProductEntity(6, "液化石油气");
        this.saveProductEntity(99, "其它");

        this.saveSeriesTypeEntity("ND", "未定义");

        this.saveSubSystemTypeEntity(0, "未知");
        this.saveSubSystemTypeEntity(1, "省");
        this.saveSubSystemTypeEntity(2, "场站");
        this.saveSubSystemTypeEntity(99, "其它");

        this.saveCableCoatingEntity(0, "未知");
        this.saveCableCoatingEntity(1, "塑料套管");
        this.saveCableCoatingEntity(2, "橡胶");
        this.saveCableCoatingEntity(3, "铠装");
        this.saveCableCoatingEntity(99, "其它");

        this.saveCableSizeEntity(0, "MinValue");
        this.saveCableSizeEntity(1000, "MaxValue");

        this.saveCableTypeEntity(0, "未知");
        this.saveCableTypeEntity(1, "导管(保护钢管)");
        this.saveCableTypeEntity(2, "架空");
        this.saveCableTypeEntity(3, "直埋");
        this.saveCableTypeEntity(4, "地表铺设");
        this.saveCableTypeEntity(5, "电缆沟");
        this.saveCableTypeEntity(99, "其它");

        this.saveGalvanicAnodeMaterialEntity(0, "未知");
        this.saveGalvanicAnodeMaterialEntity(1, "镀铂阳极");
        this.saveGalvanicAnodeMaterialEntity(2, "磁性氧化铁");
        this.saveGalvanicAnodeMaterialEntity(3, "混合金属氧化物");
        this.saveGalvanicAnodeMaterialEntity(4, "镁");
        this.saveGalvanicAnodeMaterialEntity(5, "锌");
        this.saveGalvanicAnodeMaterialEntity(6, "铂");
        this.saveGalvanicAnodeMaterialEntity(7, "高硅铸铁");
        this.saveGalvanicAnodeMaterialEntity(8, "石墨");
        this.saveGalvanicAnodeMaterialEntity(9, "废钢铁");
        this.saveGalvanicAnodeMaterialEntity(10, "碳");
        this.saveGalvanicAnodeMaterialEntity(11, "铝合金");
        this.saveGalvanicAnodeMaterialEntity(99, "其它");

        this.saveGalvanicAnodeWeightEntity(0, "MinValue");
        this.saveGalvanicAnodeWeightEntity(100, "MaxValue");

        this.saveGBBackFillMaterialEntity(0, "未知");
        this.saveGBBackFillMaterialEntity(1, "煤焦炭渣");
        this.saveGBBackFillMaterialEntity(2, "煅烧石油焦炭渣");
        this.saveGBBackFillMaterialEntity(3, "天然石墨颗粒");
        this.saveGBBackFillMaterialEntity(4, "碎的人造石墨");
        this.saveGBBackFillMaterialEntity(99, "其它");

        this.saveGBStructureEntity(0, "未知");
        this.saveGBStructureEntity(1, "浅埋立式");
        this.saveGBStructureEntity(2, "浅埋水平");
        this.saveGBStructureEntity(3, "立式深埋");
        this.saveGBStructureEntity(99, "其它");

        this.savePowerOperatingAmpsOutEntity(0, "MinValue");
        this.savePowerOperatingAmpsOutEntity(100, "MaxValue");

        this.savePowerOperatingVoltsOutEntity(0, "MinValue");
        this.savePowerOperatingVoltsOutEntity(100, "MaxValue");

        this.savePowerProtectTypeEntity(0, "未知");
        this.savePowerProtectTypeEntity(1, "站外管道");
        this.savePowerProtectTypeEntity(2, "站内管道");
        this.savePowerProtectTypeEntity(99, "其它");

        this.savePowerRatedAmpsOutEntity(0, "MinValue");
        this.savePowerRatedAmpsOutEntity(100, "MaxValue");

        this.savePowerRatedVoltsOutEntity(0, "MinValue");
        this.savePowerRatedVoltsOutEntity(380, "MaxValue");

        this.savePowerTypeEntity(0, "未知");
        this.savePowerTypeEntity(1, "恒电位仪");
        this.savePowerTypeEntity(2, "整流器");
        this.savePowerTypeEntity(99, "其它");

        this.saveDaysOfWeekEntity(0, "MinValue");
        this.saveDaysOfWeekEntity(7, "MaxValue");

        this.saveROWPermitTypeEntity(0, "未知");
        this.saveROWPermitTypeEntity(1, "公共用地");
        this.saveROWPermitTypeEntity(2, "购买/独有");
        this.saveROWPermitTypeEntity(3, "政府用地-国土局");
        this.saveROWPermitTypeEntity(4, "购买/共有");
        this.saveROWPermitTypeEntity(5, "政府用地-森林");
        this.saveROWPermitTypeEntity(99, "其它");

        this.saveROWTypeEntity(0, "未知");
        this.saveROWTypeEntity(1, "中心线");
        this.saveROWTypeEntity(2, "阀室");
        this.saveROWTypeEntity(3, "道路");
        this.saveROWTypeEntity(4, "站场边界");
        this.saveROWTypeEntity(99, "其它");

        this.saveSignTypeEntity(0, "未知");
        this.saveSignTypeEntity(1, "彩带");
        this.saveSignTypeEntity(2, "塑料薄膜");
        this.saveSignTypeEntity(99, "其它");

        this.saveStructureTypeEntity(0, "未知");
        this.saveStructureTypeEntity(1, "省政府、直辖市驻地街区");
        this.saveStructureTypeEntity(2, "市(地级市)政府驻地街区");
        this.saveStructureTypeEntity(3, "县(县级市)政府驻地街区");
        this.saveStructureTypeEntity(4, "乡政府驻地街区");
        this.saveStructureTypeEntity(7, "公安局\\派出所");
        this.saveStructureTypeEntity(8, "消防队");
        this.saveStructureTypeEntity(9, "军队驻地");
        this.saveStructureTypeEntity(12, "油(气)库(罐)");
        this.saveStructureTypeEntity(13, "加油站");
        this.saveStructureTypeEntity(15, "村庄");
        this.saveStructureTypeEntity(18, "学校学生人数大于500人");
        this.saveStructureTypeEntity(21, "学校学生人数不到500人");
        this.saveStructureTypeEntity(24, "幼儿园");
        this.saveStructureTypeEntity(27, "医院");
        this.saveStructureTypeEntity(30, "工矿企业");
        this.saveStructureTypeEntity(31, "维抢修中心");
        this.saveStructureTypeEntity(33, "仓库、仓储建筑物");
        this.saveStructureTypeEntity(36, "科研院所、事业单位、办公楼");
        this.saveStructureTypeEntity(39, "小型商店、杂货店、小卖部");
        this.saveStructureTypeEntity(40, "温室大棚");
        this.saveStructureTypeEntity(42, "大型商店、商业广场等");
        this.saveStructureTypeEntity(45, "农贸市场、集市");
        this.saveStructureTypeEntity(48, "餐馆或酒吧");
        this.saveStructureTypeEntity(51, "监狱");
        this.saveStructureTypeEntity(54, "旅馆");
        this.saveStructureTypeEntity(57, "公寓楼(居民楼)");
        this.saveStructureTypeEntity(60, "多家庭住宅、居民(平房)");
        this.saveStructureTypeEntity(63, "单一家庭住宅、居民(平房)");
        this.saveStructureTypeEntity(66, "无人居住设施(车库、工棚、谷仓)");
        this.saveStructureTypeEntity(69, "公园(标出边界)");
        this.saveStructureTypeEntity(72, "户外运动场(足球场、棒球场、篮球场等)");
        this.saveStructureTypeEntity(75, "电影院、音乐厅");
        this.saveStructureTypeEntity(78, "名胜古迹");
        this.saveStructureTypeEntity(81, "寺庙、教堂");
        this.saveStructureTypeEntity(84, "疗养院");
        this.saveStructureTypeEntity(87, "停车场");
        this.saveStructureTypeEntity(93, "体育馆");
        this.saveStructureTypeEntity(96, "厂房");
        this.saveStructureTypeEntity(99, "其它");

        this.saveWeeksPerYearEntity(0, "MinValue");
        this.saveWeeksPerYearEntity(52, "MaxValue");

        this.saveCompanyTypeEntity(0, "未知");
        this.saveCompanyTypeEntity(1, "管道运营公司");
        this.saveCompanyTypeEntity(2, "施工单位");
        this.saveCompanyTypeEntity(3, "设计单位");
        this.saveCompanyTypeEntity(4, "勘查单位");
        this.saveCompanyTypeEntity(5, "规划单位");
        this.saveCompanyTypeEntity(6, "监理单位");
        this.saveCompanyTypeEntity(7, "检测单位");
        this.saveCompanyTypeEntity(8, "运输公司");
        this.saveCompanyTypeEntity(9, "油气供应单位");
        this.saveCompanyTypeEntity(10, "清管公司");
        this.saveCompanyTypeEntity(11, "供应商");
        this.saveCompanyTypeEntity(12, "制造厂商");
        this.saveCompanyTypeEntity(13, "外部油气管道公司");
        this.saveCompanyTypeEntity(14, "油气用户");
        this.saveCompanyTypeEntity(15, "政府机关");
        this.saveCompanyTypeEntity(16, "公安部门");
        this.saveCompanyTypeEntity(17, "消防单位");
        this.saveCompanyTypeEntity(18, "医疗卫生单位");
        this.saveCompanyTypeEntity(19, "环保部门");
        this.saveCompanyTypeEntity(20, "教育部门");
        this.saveCompanyTypeEntity(21, "文体单位");
        this.saveCompanyTypeEntity(22, "供电单位");
        this.saveCompanyTypeEntity(23, "供水单位");
        this.saveCompanyTypeEntity(24, "供热单位");
        this.saveCompanyTypeEntity(25, "铁路部门");
        this.saveCompanyTypeEntity(26, "公路部门");
        this.saveCompanyTypeEntity(27, "水运部门");
        this.saveCompanyTypeEntity(28, "航空运输");
        this.saveCompanyTypeEntity(29, "通信公司");
        this.saveCompanyTypeEntity(30, "社团组织");
        this.saveCompanyTypeEntity(31, "个体户");
        this.saveCompanyTypeEntity(32, "土地所有单位");
        this.saveCompanyTypeEntity(33, "老幼福利单位");
        this.saveCompanyTypeEntity(99, "其它");

        this.saveContactTypeEntity(0, "未知");
        this.saveContactTypeEntity(1, "公司员工");
        this.saveContactTypeEntity(2, "应急情况联系人");
        this.saveContactTypeEntity(3, "管理者、经理、法人");
        this.saveContactTypeEntity(4, "土地、房屋所有者");
        this.saveContactTypeEntity(5, "系统用户");
        this.saveContactTypeEntity(6, "工程建设人员");
        this.saveContactTypeEntity(99, "其它");

        this.savePipeRepairEntity(0, "未知");
        this.savePipeRepairEntity(1, "套袖");
        this.savePipeRepairEntity(2, "打磨");
        this.savePipeRepairEntity(3, "带压封堵");
        this.savePipeRepairEntity(4, "补焊");
        this.savePipeRepairEntity(5, "热焊接");
        this.savePipeRepairEntity(6, "ClockSpring 修复");
        this.savePipeRepairEntity(7, "夹具");
        this.savePipeRepairEntity(8, "补强");
        this.savePipeRepairEntity(9, "防腐层修复");
        this.savePipeRepairEntity(99, "其它");

        this.saveAppurtenanceTypeEntity("UNK", "未知");
        this.saveAppurtenanceTypeEntity("GDD", "固定礅");
        this.saveAppurtenanceTypeEntity("GGZ", "固管桩");
        this.saveAppurtenanceTypeEntity("PT", "配铁");
        this.saveAppurtenanceTypeEntity("GB", "盖板");
        this.saveAppurtenanceTypeEntity("OTHR", "其它");

        this.saveBendAngleEntity(0, "MinValue");
        this.saveBendAngleEntity(359, "MaxValue");

        this.saveBreakePointRateEntity(0, "未知");
        this.saveBreakePointRateEntity(1, "轻");
        this.saveBreakePointRateEntity(2, "中");
        this.saveBreakePointRateEntity(3, "重");
        this.saveBreakePointRateEntity(99, "其他");

        this.saveCasingFillMaterialEntity(0, "未知");
        this.saveCasingFillMaterialEntity(1, "石油沥青");
        this.saveCasingFillMaterialEntity(2, "环氧煤沥青");
        this.saveCasingFillMaterialEntity(3, "煤焦油瓷漆");
        this.saveCasingFillMaterialEntity(4, "聚乙烯");
        this.saveCasingFillMaterialEntity(5, "熔结环氧粉末");
        this.saveCasingFillMaterialEntity(6, "混凝土");
        this.saveCasingFillMaterialEntity(7, "塑料");
        this.saveCasingFillMaterialEntity(8, "木屑");
        this.saveCasingFillMaterialEntity(9, "绝缘体");
        this.saveCasingFillMaterialEntity(99, "其它");

        this.saveCasingSealTypeEntity(0, "未知");
        this.saveCasingSealTypeEntity(1, "螺栓");
        this.saveCasingSealTypeEntity(2, "混凝土");
        this.saveCasingSealTypeEntity(3, "环氧树脂");
        this.saveCasingSealTypeEntity(4, "密封连接");
        this.saveCasingSealTypeEntity(5, "橡胶密封护套");
        this.saveCasingSealTypeEntity(6, "密封罩");
        this.saveCasingSealTypeEntity(99, "其它");

        this.saveCasingTypeEntity(0, "未知");
        this.saveCasingTypeEntity(1, "钢套管");
        this.saveCasingTypeEntity(2, "钢筋混凝土套管");
        this.saveCasingTypeEntity(3, "水泥套管");
        this.saveCasingTypeEntity(4, "复合套管");
        this.saveCasingTypeEntity(5, "收缩套管");
        this.saveCasingTypeEntity(99, "其它");

        this.saveClosureTypeEntity(0, "未知");
        this.saveClosureTypeEntity(1, "盲板法兰");
        this.saveClosureTypeEntity(2, "铰链连接挡板");
        this.saveClosureTypeEntity(3, "机械栓塞");
        this.saveClosureTypeEntity(4, "焊接封帽");
        this.saveClosureTypeEntity(5, "焊接法兰");
        this.saveClosureTypeEntity(6, "耶鲁封帽");
        this.saveClosureTypeEntity(7, "塞子");
        this.saveClosureTypeEntity(8, "DN200 封头");
        this.saveClosureTypeEntity(9, "DN150 封头");
        this.saveClosureTypeEntity(10, "DN300 封头");
        this.saveClosureTypeEntity(11, "DN250 封头");
        this.saveClosureTypeEntity(99, "其它");

        this.saveCoatingConditionEntity(0, "未知");
        this.saveCoatingConditionEntity(1, "很好");
        this.saveCoatingConditionEntity(2, "少量破损");
        this.saveCoatingConditionEntity(3, "大规模破损");
        this.saveCoatingConditionEntity(4, "无防腐层");
        this.saveCoatingConditionEntity(99, "其它");

        this.saveCoatingMaterialEntity(0, "未知");
        this.saveCoatingMaterialEntity(1, "石油沥青");
        this.saveCoatingMaterialEntity(2, "煤焦油带,沥青焦油等");
        this.saveCoatingMaterialEntity(3, "煤焦油瓷漆");
        this.saveCoatingMaterialEntity(4, "油漆");
        this.saveCoatingMaterialEntity(5, "胶带");
        this.saveCoatingMaterialEntity(6, "收缩带/套");
        this.saveCoatingMaterialEntity(7, "双层环氧树脂");
        this.saveCoatingMaterialEntity(8, "单层熔结环氧粉末");
        this.saveCoatingMaterialEntity(9, "单层熔结环氧粉末 + 胶带");
        this.saveCoatingMaterialEntity(10, "双层熔结环氧树脂");
        this.saveCoatingMaterialEntity(11, "无溶剂型液态环氧");
        this.saveCoatingMaterialEntity(12, "三层PE+收缩套/带+弯管涂层");
        this.saveCoatingMaterialEntity(13, "环氧煤沥青");
        this.saveCoatingMaterialEntity(14, "聚乙烯胶粘带");
        this.saveCoatingMaterialEntity(15, "液态环氧+热收缩套/带");
        this.saveCoatingMaterialEntity(16, "泡沫夹克防腐层");
        this.saveCoatingMaterialEntity(17, "溶剂型液态环氧");
        this.saveCoatingMaterialEntity(18, "三层PE");
        this.saveCoatingMaterialEntity(19, "三层PE加强级");
        this.saveCoatingMaterialEntity(20, "煤焦油瓷漆加强级");
        this.saveCoatingMaterialEntity(21, "RD-6缠绕带");
        this.saveCoatingMaterialEntity(22, "三层PE高温型");
        this.saveCoatingMaterialEntity(23, "环氧煤粉末");
        this.saveCoatingMaterialEntity(24, "粘弹体+防水胶带");
        this.saveCoatingMaterialEntity(25, "粘弹体+聚丙烯护套");
        this.saveCoatingMaterialEntity(99, "其它");

        this.saveCoatingSourceEntity(0, "未知");
        this.saveCoatingSourceEntity(1, "现场涂装");
        this.saveCoatingSourceEntity(2, "工厂预制");
        this.saveCoatingSourceEntity(99, "其它");

        this.saveCPPowerWorkTypeEntity(0, "未知");
        this.saveCPPowerWorkTypeEntity(1, "自动");
        this.saveCPPowerWorkTypeEntity(2, "手动");
        this.saveCPPowerWorkTypeEntity(99, "其他");

        this.saveCPStatusEntity(0, "未知");
        this.saveCPStatusEntity(1, "正常");
        this.saveCPStatusEntity(2, "过保护");
        this.saveCPStatusEntity(3, "欠保护");
        this.saveCPStatusEntity(99, "其他");

        this.saveCrossingMethodEntity(0, "未知");
        this.saveCrossingMethodEntity(1, "大开挖");
        this.saveCrossingMethodEntity(2, "顶管");
        this.saveCrossingMethodEntity(3, "定向钻");
        this.saveCrossingMethodEntity(4, "隧道");
        this.saveCrossingMethodEntity(5, "大型隧道(车辆可通过)");
        this.saveCrossingMethodEntity(6, "盾构");
        this.saveCrossingMethodEntity(7, "梁式管桥");
        this.saveCrossingMethodEntity(8, "拱形管桥");
        this.saveCrossingMethodEntity(9, "悬垂型穿跨越");
        this.saveCrossingMethodEntity(10, "悬缆斜拉跨越");
        this.saveCrossingMethodEntity(11, "混合悬吊跨越");
        this.saveCrossingMethodEntity(12, "桁架跨越");
        this.saveCrossingMethodEntity(13, "斜拉锁跨越");
        this.saveCrossingMethodEntity(14, "涵洞");
        this.saveCrossingMethodEntity(99, "其它");

        this.saveCrossingObjectEntity(0, "未知");
        this.saveCrossingObjectEntity(1, "河流穿跨越");
        this.saveCrossingObjectEntity(2, "公路穿跨越");
        this.saveCrossingObjectEntity(3, "铁路穿跨越");
        this.saveCrossingObjectEntity(4, "公共设施穿跨越");
        this.saveCrossingObjectEntity(5, "栅栏");
        this.saveCrossingObjectEntity(7, "树篱");
        this.saveCrossingObjectEntity(8, "洼地");
        this.saveCrossingObjectEntity(9, "排水沟");
        this.saveCrossingObjectEntity(99, "其它");

        this.saveCurrentTypeEntity(0, "未知");
        this.saveCurrentTypeEntity(1, "交流");
        this.saveCurrentTypeEntity(2, "直流");
        this.saveCurrentTypeEntity(99, "其他");

        this.saveDefectiveConditionEntity(0, "未知");
        this.saveDefectiveConditionEntity(1, "轻");
        this.saveDefectiveConditionEntity(2, "中");
        this.saveDefectiveConditionEntity(3, "重");
        this.saveDefectiveConditionEntity(99, "其他");

        this.saveDisturbanceEntity(0, "未知");
        this.saveDisturbanceEntity(1, "强");
        this.saveDisturbanceEntity(2, "中");
        this.saveDisturbanceEntity(3, "弱");
        this.saveDisturbanceEntity(99, "其他");

        this.saveElbowAngleEntity(0, "MinValue");
        this.saveElbowAngleEntity(180, "MaxValue");

        this.saveElbowTypeEntity(0, "未知");
        this.saveElbowTypeEntity(1, "正常弯头");
        this.saveElbowTypeEntity(2, "变径弯头");
        this.saveElbowTypeEntity(99, "其它");

        this.saveEmergencyServiceEntity(0, "未知");
        this.saveEmergencyServiceEntity(1, "医院");
        this.saveEmergencyServiceEntity(2, "消防队");
        this.saveEmergencyServiceEntity(3, "警察局、派出所");
        this.saveEmergencyServiceEntity(4, "急救站");
        this.saveEmergencyServiceEntity(5, "地区行政机构");
        this.saveEmergencyServiceEntity(6, "军事机构");
        this.saveEmergencyServiceEntity(7, "消防水源");
        this.saveEmergencyServiceEntity(99, "其它");

        this.saveEvaluationResultsEntity(0, "未知的");
        this.saveEvaluationResultsEntity(1, "轻");
        this.saveEvaluationResultsEntity(2, "中");
        this.saveEvaluationResultsEntity(3, "重");
        this.saveEvaluationResultsEntity(99, "其他");

        this.saveFittingMaterialEntity(0, "未知");
        this.saveFittingMaterialEntity(1, "钢材");
        this.saveFittingMaterialEntity(2, "塑料");
        this.saveFittingMaterialEntity(99, "其它");

        this.saveFloodProMaterialTypeEntity(0, "未知");
        this.saveFloodProMaterialTypeEntity(1, "块石");
        this.saveFloodProMaterialTypeEntity(2, "砂袋");
        this.saveFloodProMaterialTypeEntity(3, "混凝土");
        this.saveFloodProMaterialTypeEntity(4, "砖砌块");
        this.saveFloodProMaterialTypeEntity(5, "粘土");
        this.saveFloodProMaterialTypeEntity(6, "沙砾石");
        this.saveFloodProMaterialTypeEntity(7, "砼");
        this.saveFloodProMaterialTypeEntity(8, "草袋");
        this.saveFloodProMaterialTypeEntity(9, "毛石砂浆");
        this.saveFloodProMaterialTypeEntity(10, "灰土");
        this.saveFloodProMaterialTypeEntity(11, "浆砌毛石");
        this.saveFloodProMaterialTypeEntity(12, "浆砌片石");
        this.saveFloodProMaterialTypeEntity(13, "浆砌石");
        this.saveFloodProMaterialTypeEntity(14, "制构件");
        this.saveFloodProMaterialTypeEntity(99, "其它");

        this.saveFloodProTypeEntity(0, "未知");
        this.saveFloodProTypeEntity(1, "围堰");
        this.saveFloodProTypeEntity(2, "堤坝");
        this.saveFloodProTypeEntity(3, "挡墙");
        this.saveFloodProTypeEntity(4, "排洪沟");
        this.saveFloodProTypeEntity(5, "护坡");
        this.saveFloodProTypeEntity(6, "过水涵洞");
        this.saveFloodProTypeEntity(7, "截水沟");
        this.saveFloodProTypeEntity(8, "配重块");
        this.saveFloodProTypeEntity(9, "过水路面");
        this.saveFloodProTypeEntity(10, "沟渠硬化");
        this.saveFloodProTypeEntity(11, "截水墙");
        this.saveFloodProTypeEntity(12, "盖板");
        this.saveFloodProTypeEntity(13, "梯田田坎与排水沟");
        this.saveFloodProTypeEntity(14, "截渗墙");
        this.saveFloodProTypeEntity(15, "谷坊");
        this.saveFloodProTypeEntity(99, "其它");

        this.saveGradeEntity(0, "未知");
        this.saveGradeEntity(1, "Q295");
        this.saveGradeEntity(2, "Q345");
        this.saveGradeEntity(3, "20");
        this.saveGradeEntity(4, "L175(A25)");
        this.saveGradeEntity(5, "L210(A)");
        this.saveGradeEntity(6, "L245(B)");
        this.saveGradeEntity(7, "L290(X42)");
        this.saveGradeEntity(8, "L320(X46)");
        this.saveGradeEntity(9, "L360(X52)");
        this.saveGradeEntity(10, "L390(X56)");
        this.saveGradeEntity(11, "L415(X60)");
        this.saveGradeEntity(12, "L450(X65)");
        this.saveGradeEntity(13, "L485(X70)");
        this.saveGradeEntity(14, "L555(X80)");
        this.saveGradeEntity(30, "A3F");
        this.saveGradeEntity(50, "S360");
        this.saveGradeEntity(99, "其它");

        this.saveInternalExternalEntity(0, "未知");
        this.saveInternalExternalEntity(1, "内防腐");
        this.saveInternalExternalEntity(2, "外防腐");
        this.saveInternalExternalEntity(99, "其它");

        this.saveJointCoatingTypeEntity(0, "未知");
        this.saveJointCoatingTypeEntity(1, "热收缩带/套");
        this.saveJointCoatingTypeEntity(2, "液态环氧+热收缩套/带");
        this.saveJointCoatingTypeEntity(3, "液态涂料(环氧)");
        this.saveJointCoatingTypeEntity(4, "单层熔结环氧粉末");
        this.saveJointCoatingTypeEntity(5, "双层熔结环氧粉末");
        this.saveJointCoatingTypeEntity(6, "聚乙(丙)烯胶粘带");
        this.saveJointCoatingTypeEntity(7, "石油沥青");
        this.saveJointCoatingTypeEntity(9, "液态涂料(环氧/聚氨酯)+胶带");
        this.saveJointCoatingTypeEntity(99, "其它");

        this.saveMarkerStatusEntity(0, "未知");
        this.saveMarkerStatusEntity(1, "正常");
        this.saveMarkerStatusEntity(2, "过保护");
        this.saveMarkerStatusEntity(3, "欠保护");
        this.saveMarkerStatusEntity(99, "其他");

        this.saveMarkerTypeEntity(0, "未知");
        this.saveMarkerTypeEntity(1, "里程桩");
        this.saveMarkerTypeEntity(5, "转角桩");
        this.saveMarkerTypeEntity(6, "垂直转角桩");
        this.saveMarkerTypeEntity(10, "加密桩");
        this.saveMarkerTypeEntity(14, "测试桩");
        this.saveMarkerTypeEntity(15, "电流测试桩");
        this.saveMarkerTypeEntity(16, "电位测试桩");
        this.saveMarkerTypeEntity(20, "穿越标志桩");
        this.saveMarkerTypeEntity(21, "变壁厚标志桩");
        this.saveMarkerTypeEntity(22, "管道交叉标志桩");
        this.saveMarkerTypeEntity(23, "分界标志桩");
        this.saveMarkerTypeEntity(24, "通信标石");
        this.saveMarkerTypeEntity(25, "变防腐层标志桩");
        this.saveMarkerTypeEntity(26, "固定墩标志桩");
        this.saveMarkerTypeEntity(27, "内检测标志桩");
        this.saveMarkerTypeEntity(28, "设施桩");
        this.saveMarkerTypeEntity(30, "固管桩");
        this.saveMarkerTypeEntity(34, "警示牌");
        this.saveMarkerTypeEntity(35, "穿越警示牌");
        this.saveMarkerTypeEntity(36, "安全警告牌");
        this.saveMarkerTypeEntity(37, "场站阀室警示牌");
        this.saveMarkerTypeEntity(38, "场站阀室标志牌");
        this.saveMarkerTypeEntity(39, "穿越标志牌");
        this.saveMarkerTypeEntity(40, "光缆标志牌");
        this.saveMarkerTypeEntity(50, "临时警示桩");
        this.saveMarkerTypeEntity(55, "管道放线桩");
        this.saveMarkerTypeEntity(60, "航空标示桩");
        this.saveMarkerTypeEntity(65, "GPS基准点");

        this.saveNDTTypeEntity("UNK", "未知");
        this.saveNDTTypeEntity("DYE", "燃料渗透实验法");
        this.saveNDTTypeEntity("EDDY", "涡流");
        this.saveNDTTypeEntity("GAMM", "γ射线");
        this.saveNDTTypeEntity("MAG", "磁性粒子");
        this.saveNDTTypeEntity("RAD", "X光线照射术");
        this.saveNDTTypeEntity("SONI", "超音速");
        this.saveNDTTypeEntity("XRAY", "X射线");
        this.saveNDTTypeEntity("OTHR", "其它");
        this.saveNDTTypeEntity("US", "超声波");
        this.saveNDTTypeEntity("TOFD", "TOFD");
        this.saveNDTTypeEntity("UPA", "超声相控阵");

        this.saveNSPPipeMaterialEntity(0, "未知");
        this.saveNSPPipeMaterialEntity(1, "钢材");
        this.saveNSPPipeMaterialEntity(2, "塑料");
        this.saveNSPPipeMaterialEntity(99, "其它");

        this.saveNSPPipeTypeEntity(0, "未知");
        this.saveNSPPipeTypeEntity(1, "连接管道");
        this.saveNSPPipeTypeEntity(2, "排空管道");
        this.saveNSPPipeTypeEntity(3, "收发球筒");
        this.saveNSPPipeTypeEntity(99, "其它");

        this.savePigStructureTypeEntity(0, "未知");
        this.savePigStructureTypeEntity(1, "发球筒");
        this.savePigStructureTypeEntity(2, "收球筒");
        this.savePigStructureTypeEntity(3, "转发球筒");
        this.savePigStructureTypeEntity(99, "其它");

        this.savePipeDiameterEntity(0, "MinValue");
        this.savePipeDiameterEntity(2000, "MaxValue");

        this.savePipeJoinTypeEntity(0, "未知");
        this.savePipeJoinTypeEntity(1, "法兰");
        this.savePipeJoinTypeEntity(2, "螺纹连接");
        this.savePipeJoinTypeEntity(3, "承插");
        this.savePipeJoinTypeEntity(4, "电塞");
        this.savePipeJoinTypeEntity(5, "焊接");
        this.savePipeJoinTypeEntity(99, "其它");

        this.savePipelineDiameterEntity(0, "MinValue");
        this.savePipelineDiameterEntity(2000, "MaxValue");

        this.savePipeSeamTypeEntity(0, "未知");
        this.savePipeSeamTypeEntity(1, "螺旋焊缝");
        this.savePipeSeamTypeEntity(2, "直焊缝");
        this.savePipeSeamTypeEntity(99, "其它");

        this.savePipeSegMaterialEntity(0, "未知");
        this.savePipeSegMaterialEntity(1, "螺旋焊缝");
        this.savePipeSegMaterialEntity(2, "直焊缝");
        this.savePipeSegMaterialEntity(99, "其它");

        this.savePipeSegTypeEntity(0, "未知");
        this.savePipeSegTypeEntity(1, "直管");
        this.savePipeSegTypeEntity(2, "弯管");
        this.savePipeSegTypeEntity(3, "变径管");
        this.savePipeSegTypeEntity(99, "其它");

        this.savePressureRatingEntity(0, "MinValue");
        this.savePressureRatingEntity(20, "MaxValue");

        this.saveQualityRatingEntity(0, "未知");
        this.saveQualityRatingEntity(1, "优");
        this.saveQualityRatingEntity(2, "良");
        this.saveQualityRatingEntity(3, "一般");
        this.saveQualityRatingEntity(4, "劣");
        this.saveQualityRatingEntity(5, "差");
        this.saveQualityRatingEntity(99, "其他");

        this.saveReducerSizeEntity("UNK", "未知");
        this.saveReducerSizeEntity("150x100", "168.3x114.3 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("200x150", "168.3x168.3 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("300x150", "323.9x168.3 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("350x300", "323.9x323.9 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("450x300", "457.0x323.6 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("500x450", "457.0x457.0 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("700x450", "711.0x457.0 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("700x500", "711.0x508.0 (GB12459 GB/T13401)");
        this.saveReducerSizeEntity("OTHR", "其它");

        this.saveReducerTypeEntity(0, "未知");
        this.saveReducerTypeEntity(1, "同心异径管");
        this.saveReducerTypeEntity(2, "偏心异径管");
        this.saveReducerTypeEntity(3, "偏心同径异径管");
        this.saveReducerTypeEntity(99, "其它");

        this.saveRegionCompanyEntity(0, "未知");
        this.saveRegionCompanyEntity(1, "中国石油管道公司");
        this.saveRegionCompanyEntity(2, "西气东输管道公司");
        this.saveRegionCompanyEntity(3, "华油天然气股份有限公司");
        this.saveRegionCompanyEntity(4, "西部管道有限责任公司");
        this.saveRegionCompanyEntity(99, "其他");

        this.saveRepairLanTypeEntity(0, "未知");
        this.saveRepairLanTypeEntity(1, "计划修复");
        this.saveRepairLanTypeEntity(2, "立即修复");
        this.saveRepairLanTypeEntity(3, "监控");
        this.saveRepairLanTypeEntity(99, "其他");

        this.saveRepairMethodTypeEntity(0, "未知");
        this.saveRepairMethodTypeEntity(1, "粘弹体防腐胶带+冷缠胶带");
        this.saveRepairMethodTypeEntity(2, "热熔胶+聚乙烯补伤片");
        this.saveRepairMethodTypeEntity(3, "液态环氧/聚氨酯");
        this.saveRepairMethodTypeEntity(4, "聚乙烯胶粘带");
        this.saveRepairMethodTypeEntity(99, "其他");

        this.saveRepstatusEntity(0, "未知");
        this.saveRepstatusEntity(1, "已修复");
        this.saveRepstatusEntity(2, "未修复");
        this.saveRepstatusEntity(99, "其他");

        this.saveRiskGradeEntity(0, "未知");
        this.saveRiskGradeEntity(1, "高");
        this.saveRiskGradeEntity(3, "中");
        this.saveRiskGradeEntity(5, "低");

        this.saveSoilTestResultsEntity(0, "未知的");
        this.saveSoilTestResultsEntity(1, "弱");
        this.saveSoilTestResultsEntity(2, "中");
        this.saveSoilTestResultsEntity(3, "强");
        this.saveSoilTestResultsEntity(99, "其他");

        this.saveStrengthRatingEntity(0, "MinValue");
        this.saveStrengthRatingEntity(5000, "MaxValue");

        this.saveTapFlowDirectionEntity(0, "未知");
        this.saveTapFlowDirectionEntity(1, "顺流");
        this.saveTapFlowDirectionEntity(2, "逆流");
        this.saveTapFlowDirectionEntity(3, "双向");
        this.saveTapFlowDirectionEntity(99, "其它");

        this.saveTapSizeEntity(0, "MinValue");
        this.saveTapSizeEntity(1200, "MaxValue");

        this.saveTapTypeEntity(0, "未知");
        this.saveTapTypeEntity(1, "轮距接头");
        this.saveTapTypeEntity(2, "半滑板接头");
        this.saveTapTypeEntity(3, "侧向接头");
        this.saveTapTypeEntity(4, "盗油");
        this.saveTapTypeEntity(5, "凝油");
        this.saveTapTypeEntity(99, "其它");

        this.saveTeeSizeEntity(0, "MinValue");
        this.saveTeeSizeEntity(1200, "MaxValue");

        this.saveTeeTypeEntity(0, "未知");
        this.saveTeeTypeEntity(1, "等径三通");
        this.saveTeeTypeEntity(2, "缩径三通");
        this.saveTeeTypeEntity(3, "针形三通");
        this.saveTeeTypeEntity(4, "球形三通");
        this.saveTeeTypeEntity(5, "垂直阀门三通");
        this.saveTeeTypeEntity(6, "焊接加压三通");
        this.saveTeeTypeEntity(7, "清管三通");
        this.saveTeeTypeEntity(99, "其它");

        this.saveValveFunctionEntity(0, "未知");
        this.saveValveFunctionEntity(1, "截断");
        this.saveValveFunctionEntity(2, "旁通");
        this.saveValveFunctionEntity(3, "调节");
        this.saveValveFunctionEntity(4, "放空");
        this.saveValveFunctionEntity(5, "泄压");
        this.saveValveFunctionEntity(6, "减压");
        this.saveValveFunctionEntity(99, "其它");

        this.saveValveOperatorTypeEntity(0, "未知");
        this.saveValveOperatorTypeEntity(1, "电力");
        this.saveValveOperatorTypeEntity(2, "齿轮");
        this.saveValveOperatorTypeEntity(3, "液压");
        this.saveValveOperatorTypeEntity(4, "手动");
        this.saveValveOperatorTypeEntity(5, "气动");
        this.saveValveOperatorTypeEntity(6, "伞齿型");
        this.saveValveOperatorTypeEntity(7, "气液联动");
        this.saveValveOperatorTypeEntity(8, "电液联动");
        this.saveValveOperatorTypeEntity(99, "其它");

        this.saveValvePositionEntity(0, "未知");
        this.saveValvePositionEntity(1, "常开");
        this.saveValvePositionEntity(2, "常闭");
        this.saveValvePositionEntity(99, "其它");

        this.saveValveTypeEntity(0, "未知");
        this.saveValveTypeEntity(1, "角阀");
        this.saveValveTypeEntity(2, "球阀");
        this.saveValveTypeEntity(3, "单向阀");
        this.saveValveTypeEntity(4, "闸阀");
        this.saveValveTypeEntity(5, "旋塞阀");
        this.saveValveTypeEntity(99, "其它");

        this.saveWallThicknessEntity(0, "MinValue");
        this.saveWallThicknessEntity(200, "MaxValue");

        this.saveWeldConditionEntity(0, "未知");
        this.saveWeldConditionEntity(1, "良好");
        this.saveWeldConditionEntity(2, "一般");
        this.saveWeldConditionEntity(3, "破旧");
        this.saveWeldConditionEntity(99, "其它");

        this.saveWeldTypeEntity(0, "未知");
        this.saveWeldTypeEntity(1, "连接对焊");
        this.saveWeldTypeEntity(2, "双面埋弧焊");
        this.saveWeldTypeEntity(3, "电熔焊");
        this.saveWeldTypeEntity(4, "电焊");
        this.saveWeldTypeEntity(5, "电阻焊");
        this.saveWeldTypeEntity(6, "电阻焊-高频");
        this.saveWeldTypeEntity(7, "电阻焊-低频");
        this.saveWeldTypeEntity(8, "电弧对焊");
        this.saveWeldTypeEntity(9, "搭焊");
        this.saveWeldTypeEntity(10, "磁弧焊");
        this.saveWeldTypeEntity(11, "无缝焊");
        this.saveWeldTypeEntity(12, "单埋弧焊");
        this.saveWeldTypeEntity(13, "埋弧焊");
        this.saveWeldTypeEntity(14, "螺旋焊");
        this.saveWeldTypeEntity(15, "气焊");
        this.saveWeldTypeEntity(16, "乙炔焊");
        this.saveWeldTypeEntity(17, "金属保护焊");
        this.saveWeldTypeEntity(99, "其它");

        this.saveActivityTypeEntity(0, "未知");
        this.saveActivityTypeEntity(1, "阴极保护读数");
        this.saveActivityTypeEntity(2, "管道运行读数");
        this.saveActivityTypeEntity(3, "检测");
        this.saveActivityTypeEntity(4, "完整性管理");
        this.saveActivityTypeEntity(5, "开挖验证");
        this.saveActivityTypeEntity(6, "改线");
        this.saveActivityTypeEntity(99, "其它");

        this.saveAlarmSystemEntity(0, "未知");
        this.saveAlarmSystemEntity(1, "负压波");
        this.saveAlarmSystemEntity(2, "音波");
        this.saveAlarmSystemEntity(99, "其它");

        this.saveDataResolutionEntity(0, "未知");
        this.saveDataResolutionEntity(1, "1:200");
        this.saveDataResolutionEntity(2, "1:500");
        this.saveDataResolutionEntity(3, "1:1000");
        this.saveDataResolutionEntity(4, "1:2000");
        this.saveDataResolutionEntity(5, "1:5000");
        this.saveDataResolutionEntity(6, "1:10,000");
        this.saveDataResolutionEntity(7, "1:50,000");
        this.saveDataResolutionEntity(8, "1:100,000");
        this.saveDataResolutionEntity(9, "1:250,000");
        this.saveDataResolutionEntity(10, "1:1,000,000");
        this.saveDataResolutionEntity(11, "1:4,000,000");
        this.saveDataResolutionEntity(99, "其它");

        this.saveDataStatusEntity(0, "未进行");
        this.saveDataStatusEntity(1, "进行中");
        this.saveDataStatusEntity(2, "已完成");

        this.saveGeoRiskMeasureEntity(1, "加强监控");
        this.saveGeoRiskMeasureEntity(2, "工程治理");
        this.saveGeoRiskMeasureEntity(3, "临时防护");
        this.saveGeoRiskMeasureEntity(4, "其它措施");

        this.saveIntegrityProposalEntity(0, "未知");
        this.saveIntegrityProposalEntity(1, "内检测");
        this.saveIntegrityProposalEntity(2, "直接评价");
        this.saveIntegrityProposalEntity(3, "压力试验");
        this.saveIntegrityProposalEntity(4, "其它");

        this.saveOperationalStatusEntity(0, "未知");
        this.saveOperationalStatusEntity(1, "在用的");
        this.saveOperationalStatusEntity(2, "已废弃");
        this.saveOperationalStatusEntity(3, "计划的");
        this.saveOperationalStatusEntity(4, "建设中");
        this.saveOperationalStatusEntity(5, "修复中");
        this.saveOperationalStatusEntity(6, "损坏");
        this.saveOperationalStatusEntity(99, "其它");

        this.savePercentageEntity(0, "MinValue");
        this.savePercentageEntity(100, "MaxValue");

        this.saveProjectTypeEntity(0, "未知");
        this.saveProjectTypeEntity(1, "内检测");
        this.saveProjectTypeEntity(2, "外检测");
        this.saveProjectTypeEntity(3, "HCA 评价");
        this.saveProjectTypeEntity(4, "风险评价");
        this.saveProjectTypeEntity(55, "其它");

        this.saveRiskMeasureEntity(0, "未知");
        this.saveRiskMeasureEntity(1, "水工保护工程");
        this.saveRiskMeasureEntity(2, "内检测与缺陷修复");
        this.saveRiskMeasureEntity(3, "外检测与防腐层修复");
        this.saveRiskMeasureEntity(4, "防腐层大修");
        this.saveRiskMeasureEntity(5, "换管、改线或重新穿越");
        this.saveRiskMeasureEntity(6, "加强管理(巡线、应急预案、警企联防等)");
        this.saveRiskMeasureEntity(7, "地质灾害治理");
        this.saveRiskMeasureEntity(99, "其它(加装或维修板涵、更换阳极地床、管道标识、加装截断阀、泄漏监测系 2 统、安全预警系统、占压清理等)");

        this.saveRsikFactorEntity(0, "未知");
        this.saveRsikFactorEntity(1, "第三方破坏");
        this.saveRsikFactorEntity(2, "腐蚀");
        this.saveRsikFactorEntity(3, "制造与施工缺陷");
        this.saveRsikFactorEntity(4, "误操作");
        this.saveRsikFactorEntity(5, "地质灾害");

        this.saveSystemTypeEntity(1, "泄漏监测系统");
        this.saveSystemTypeEntity(2, "地质灾害监测系统");
        this.saveSystemTypeEntity(99, "其他");

        this.saveSystemPrincipleEntity(1, "负压波");
        this.saveSystemPrincipleEntity(2, "音波");
        this.saveSystemPrincipleEntity(3, "负压波+音波");
        this.saveSystemPrincipleEntity(99, "其他");

        this.saveYesNoEntity(0, "未知");
        this.saveYesNoEntity(1, "是");
        this.saveYesNoEntity(2, "否");

        this.saveComeFromFlagEntity(0, "未知");
        this.saveComeFromFlagEntity(1, "内检测");
        this.saveComeFromFlagEntity(2, "外检测");
        this.saveComeFromFlagEntity(3, "直接评价");
        this.saveComeFromFlagEntity(4, "事件上报");
        this.saveComeFromFlagEntity(99, "其它");

        this.saveContractTypeEntity(1, "地质灾害(水工保护)");
        this.saveContractTypeEntity(2, "阀室改造");
        this.saveContractTypeEntity(3, "阀室新增");
        this.saveContractTypeEntity(4, "改线改造");
        this.saveContractTypeEntity(5, "河穿越改造(大开挖)");
        this.saveContractTypeEntity(6, "铁路(公路)改造");
        this.saveContractTypeEntity(7, "河穿越改造(定向钻)");
        this.saveContractTypeEntity(8, "道路整治");
        this.saveContractTypeEntity(9, "管道防腐层大修");
        this.saveContractTypeEntity(10, "外腐蚀直接评价(ECDA)工程");
        this.saveContractTypeEntity(11, "管道内检测");
        this.saveContractTypeEntity(12, "管体缺陷修复");
        this.saveContractTypeEntity(13, "风险评价工作");
        this.saveContractTypeEntity(14, "地质灾害风险评价工作");
        this.saveContractTypeEntity(15, "HCA 评价工作");

        this.saveCoodiPrecisionEntity(0, "未知");
        this.saveCoodiPrecisionEntity(1, "高精度");
        this.saveCoodiPrecisionEntity(2, "低精度");
        this.saveCoodiPrecisionEntity(3, "计算得到");

        this.saveCorrosionDegreeEntity(0, "未知");
        this.saveCorrosionDegreeEntity(1, "<20%t");
        this.saveCorrosionDegreeEntity(2, "≤20%t and <30%t");
        this.saveCorrosionDegreeEntity(3, "≤30%t and <40%t");
        this.saveCorrosionDegreeEntity(4, "≤40%t and <50%t");
        this.saveCorrosionDegreeEntity(5, "≤50%t and <60%t");
        this.saveCorrosionDegreeEntity(6, "≤60%t and <70%t");
        this.saveCorrosionDegreeEntity(7, "≥80%t");
        this.saveCorrosionDegreeEntity(99, "其他");

        this.saveCrackTypeEntity(0, "未知");
        this.saveCrackTypeEntity(1, "轴向裂纹");
        this.saveCrackTypeEntity(2, "轴向表层破损裂纹");
        this.saveCrackTypeEntity(3, "裂纹域");
        this.saveCrackTypeEntity(4, "裂纹描述");
        this.saveCrackTypeEntity(5, "环向裂纹");
        this.saveCrackTypeEntity(6, "构造结合缺陷");
        this.saveCrackTypeEntity(7, "环向表层缺陷");
        this.saveCrackTypeEntity(8, "凹陷");
        this.saveCrackTypeEntity(9, "凹陷焊接");
        this.saveCrackTypeEntity(10, "趋于凹陷裂纹");
        this.saveCrackTypeEntity(11, "金属损伤导致的凹陷");
        this.saveCrackTypeEntity(12, "压力凹陷");
        this.saveCrackTypeEntity(13, "外部裂纹缺陷");
        this.saveCrackTypeEntity(14, "外部金属损伤");
        this.saveCrackTypeEntity(15, "基于几何学的");
        this.saveCrackTypeEntity(16, "周围不规则焊缝");
        this.saveCrackTypeEntity(17, "基本运转");
        this.saveCrackTypeEntity(18, "内含物描述");
        this.saveCrackTypeEntity(19, "安装");
        this.saveCrackTypeEntity(20, "内部造成的缺点");
        this.saveCrackTypeEntity(21, "内部金属损失");
        this.saveCrackTypeEntity(22, "直流金属损伤和低频焊缝焊接");
        this.saveCrackTypeEntity(23, "金属损伤");
        this.saveCrackTypeEntity(24, "不可判定的");
        this.saveCrackTypeEntity(25, "凹口描述");
        this.saveCrackTypeEntity(26, "不规则焊接焊缝");
        this.saveCrackTypeEntity(27, "应力裂纹腐蚀");
        this.saveCrackTypeEntity(99, "其它");

        this.saveDataSourceEntity(0, "未知");
        this.saveDataSourceEntity(1, "测绘");
        this.saveDataSourceEntity(2, "管道资料数字化");
        this.saveDataSourceEntity(3, "PIS");
        this.saveDataSourceEntity(4, "内检测数据");
        this.saveDataSourceEntity(5, "A4");

        this.saveDetectionTypeEntity(0, "未知");
        this.saveDetectionTypeEntity(1, "几何变形检测器");
        this.saveDetectionTypeEntity(2, "超声横波检测器");
        this.saveDetectionTypeEntity(3, "漏磁检测器");
        this.saveDetectionTypeEntity(4, "超声纵波检测器");
        this.saveDetectionTypeEntity(5, "电磁超声检测器");
        this.saveDetectionTypeEntity(6, "IMU 检测器");
        this.saveDetectionTypeEntity(99, "其它");

        this.saveFeatureClassEntity(0, "未知");
        this.saveFeatureClassEntity(1, "裂纹");
        this.saveFeatureClassEntity(2, "凹陷");
        this.saveFeatureClassEntity(3, "金属损失");
        this.saveFeatureClassEntity(4, "焊缝异常");
        this.saveFeatureClassEntity(5, "椭圆变形");

        this.saveDentTypeEntity(0, "未知", "UN");
        this.saveDentTypeEntity(1, "普通凹陷", "DENT");
        this.saveDentTypeEntity(2, "与金属损失有关的凹陷", "DENTML");
        this.saveDentTypeEntity(3, "与螺旋焊缝有关的凹陷", "DENTSW");
        this.saveDentTypeEntity(4, "凹陷环焊缝螺旋焊缝相关", "DENTGWSW");
        this.saveDentTypeEntity(5, "凹陷环焊缝相关", "DENTGW");
        this.saveDentTypeEntity(6, "凹陷螺旋焊缝金属损失相关", "DENTSWML");
        this.saveDentTypeEntity(99, "其它", "OTH");

        this.saveInspectionMethodEntity(0, "未知");
        this.saveInspectionMethodEntity(1, "漏磁检测");
        this.saveInspectionMethodEntity(2, "超声导波");
        this.saveInspectionMethodEntity(3, "PCM");
        this.saveInspectionMethodEntity(4, "密间距电位测量");
        this.saveInspectionMethodEntity(5, "直流电位梯度法");
        this.saveInspectionMethodEntity(6, "现场开挖");
        this.saveInspectionMethodEntity(7, "外腐蚀直接评价");
        this.saveInspectionMethodEntity(8, "超声");
        this.saveInspectionMethodEntity(99, "其它");

        this.saveMediaTypeEntity(0, "未知");
        this.saveMediaTypeEntity(1, "原油");
        this.saveMediaTypeEntity(2, "成品油");
        this.saveMediaTypeEntity(3, "天燃气");
        this.saveMediaTypeEntity(4, "水");
        this.saveMediaTypeEntity(99, "其它");

        this.saveMetalLossTypeEntity(0, "未知", "UN");
        this.saveMetalLossTypeEntity(1, "外部制造缺陷长", "EMFL");
        this.saveMetalLossTypeEntity(2, "外部制造缺陷", "EMF");
        this.saveMetalLossTypeEntity(3, "迭片相关外部制造缺陷", "EMFLA");
        this.saveMetalLossTypeEntity(4, "外部金属损失", "EML");
        this.saveMetalLossTypeEntity(5, "外部金属损失长", "EMLL");
        this.saveMetalLossTypeEntity(6, "内部制造缺陷长", "IMFL");
        this.saveMetalLossTypeEntity(7, "内部金属损失长", "IMLL");
        this.saveMetalLossTypeEntity(8, "内部金属损失", "IML");
        this.saveMetalLossTypeEntity(9, "内部制造缺陷", "IMF");
        this.saveMetalLossTypeEntity(10, "贴近管壁的金属", "MCP");
        this.saveMetalLossTypeEntity(11, "外接金属物", "TMA");
        this.saveMetalLossTypeEntity(12, "熔焊点", "PUDL");
        this.saveMetalLossTypeEntity(13, "机械划痕", "GOUG");
        this.saveMetalLossTypeEntity(14, "金属损失", "ML");
        this.saveMetalLossTypeEntity(99, "其他", "OTH");

        this.savePCMDCACEntity(1, "直流");
        this.savePCMDCACEntity(2, "交流");

        this.savePipeRepMethodEntity(0, "未修复");
        this.savePipeRepMethodEntity(1, "打磨");
        this.savePipeRepMethodEntity(2, "补焊");
        this.savePipeRepMethodEntity(3, "补板");
        this.savePipeRepMethodEntity(4, "环氧套筒");
        this.savePipeRepMethodEntity(5, "B型套筒");
        this.savePipeRepMethodEntity(6, "换管");
        this.savePipeRepMethodEntity(7, "机械夹具");
        this.savePipeRepMethodEntity(8, "复合材料");
        this.savePipeRepMethodEntity(9, "带压开孔");
        this.savePipeRepMethodEntity(10, "连接器");
        this.savePipeRepMethodEntity(99, "其它");

        this.savePressureUnitEntity(0, "SMYS");
        this.savePressureUnitEntity(1, "MAOP");

        this.saveRepairStatusEntity(1, "已修复");
        this.saveRepairStatusEntity(2, "未修复");
        this.saveRepairStatusEntity(3, "额外修复");

        this.saveStrainDirectionTypeEntity(0, "未知");
        this.saveStrainDirectionTypeEntity(1, "Horizontal");
        this.saveStrainDirectionTypeEntity(2, "Vertical");
        this.saveStrainDirectionTypeEntity(3, "Horizontal/Vertical");
        this.saveStrainDirectionTypeEntity(99, "其他");

        this.saveUseAvgRateEntity(0, "不使用");
        this.saveUseAvgRateEntity(1, "使用平均腐蚀速率");

        this.saveUseMaxRateEntity(0, "不使用");
        this.saveUseMaxRateEntity(1, "使用最大腐蚀速率");

        this.saveWeldDefTypeEntity(0, "未知", "UN");
        this.saveWeldDefTypeEntity(1, "螺旋焊缝异常", "SWAL");
        this.saveWeldDefTypeEntity(2, "环焊缝异常", "GWA");
        this.saveWeldDefTypeEntity(3, "焊弧缺陷", "LSAWS");
        this.saveWeldDefTypeEntity(4, "焊缝异常", "LWA");
        this.saveWeldDefTypeEntity(99, "其它", "OTH");

        this.savePipeRepMethodEntity(0, "未修复");
        this.savePipeRepMethodEntity(1, "打磨");
        this.savePipeRepMethodEntity(2, "补焊");
        this.savePipeRepMethodEntity(3, "补板");
        this.savePipeRepMethodEntity(4, "环氧套筒");
        this.savePipeRepMethodEntity(5, "B 型套筒");
        this.savePipeRepMethodEntity(6, "换管");
        this.savePipeRepMethodEntity(7, "机械夹具");
        this.savePipeRepMethodEntity(8, "复合材料");
        this.savePipeRepMethodEntity(9, "带压开孔");
        this.savePipeRepMethodEntity(10, "连接器");
        this.savePipeRepMethodEntity(99, "其它");

        this.saveLifeCycleEntity(1, "规划和设计");
        this.saveLifeCycleEntity(2, "建设");
        this.saveLifeCycleEntity(3, "试运行");
        this.saveLifeCycleEntity(4, "运行");
        this.saveLifeCycleEntity(98, "封存");
        this.saveLifeCycleEntity(99, "废弃");

        this.saveAspectCodeEntity(-1, "无方向,平坦的");
        this.saveAspectCodeEntity(1, "337.50 - 22.50");
        this.saveAspectCodeEntity(2, "22.50 - 67.50");
        this.saveAspectCodeEntity(3, "67.50 - 112.50");
        this.saveAspectCodeEntity(4, "112.50 - 157.50");
        this.saveAspectCodeEntity(5, "157.50 - 202.50");
        this.saveAspectCodeEntity(6, "202.50 - 247.50");
        this.saveAspectCodeEntity(7, "247.50 - 292.50");
        this.saveAspectCodeEntity(8, "292.50 - 337.50");
        this.saveAspectCodeEntity(9, "未知");

        this.saveCrossingStatusEntity(0, "未知");
        this.saveCrossingStatusEntity(1, "使用中");
        this.saveCrossingStatusEntity(2, "建设中");
        this.saveCrossingStatusEntity(3, "建议使用");
        this.saveCrossingStatusEntity(4, "废弃");
        this.saveCrossingStatusEntity(99, "其它");

        this.saveFaultLineDirectionEntity(0, "未知");
        this.saveFaultLineDirectionEntity(1, "北");
        this.saveFaultLineDirectionEntity(2, "南");
        this.saveFaultLineDirectionEntity(3, "东");
        this.saveFaultLineDirectionEntity(4, "西");
        this.saveFaultLineDirectionEntity(5, "西北");
        this.saveFaultLineDirectionEntity(6, "东北");
        this.saveFaultLineDirectionEntity(7, "西南");
        this.saveFaultLineDirectionEntity(8, "东南");
        this.saveFaultLineDirectionEntity(99, "其它");

        this.saveFaultTypeEntity(0, "未知");
        this.saveFaultTypeEntity(2, "陡坎");
        this.saveFaultTypeEntity(3, "正断层或断层");
        this.saveFaultTypeEntity(4, "逆向断层或冲断层");
        this.saveFaultTypeEntity(5, "走滑断层(平推断层)");
        this.saveFaultTypeEntity(6, "地堑");
        this.saveFaultTypeEntity(7, "断裂挠曲(枢纽断层)");
        this.saveFaultTypeEntity(99, "其它");

        this.saveFloodClassEntity(0, "未知");
        this.saveFloodClassEntity(1, "高");
        this.saveFloodClassEntity(2, "中");
        this.saveFloodClassEntity(3, "低");
        this.saveFloodClassEntity(99, "其它");

        this.saveForignPipeTypeEntity(0, "未知");
        this.saveForignPipeTypeEntity(1, "公司自有其它油管道");
        this.saveForignPipeTypeEntity(2, "公司自有其它气管道");
        this.saveForignPipeTypeEntity(3, "其它公司油管道");
        this.saveForignPipeTypeEntity(4, "其它公司气管道");
        this.saveForignPipeTypeEntity(99, "其它");

        this.saveHydroTypeEntity(0, "未知");
        this.saveHydroTypeEntity(10, "河流");
        this.saveHydroTypeEntity(20, "水渠");
        this.saveHydroTypeEntity(30, "排洪沟");
        this.saveHydroTypeEntity(35, "运河");
        this.saveHydroTypeEntity(60, "湖泊");
        this.saveHydroTypeEntity(65, "池塘");
        this.saveHydroTypeEntity(70, "水库");
        this.saveHydroTypeEntity(80, "时令河");
        this.saveHydroTypeEntity(90, "干河床");
        this.saveHydroTypeEntity(96, "地下水/暗河");
        this.saveHydroTypeEntity(99, "其它");

        this.saveLandUseTypeEntity(0, "未知");
        this.saveLandUseTypeEntity(4, "城市用地和建筑群用地");
        this.saveLandUseTypeEntity(8, "农田和牧场");
        this.saveLandUseTypeEntity(12, "灌溉农田和牧场");
        this.saveLandUseTypeEntity(16, "旱地/灌溉农田和牧场");
        this.saveLandUseTypeEntity(20, "农田/草地混合地");
        this.saveLandUseTypeEntity(24, "农田/森林混合地");
        this.saveLandUseTypeEntity(28, "果树/经济林");
        this.saveLandUseTypeEntity(32, "草地");
        this.saveLandUseTypeEntity(36, "灌木丛");
        this.saveLandUseTypeEntity(40, "灌木丛/草地混合地");
        this.saveLandUseTypeEntity(44, "热带草原");
        this.saveLandUseTypeEntity(48, "森林");
        this.saveLandUseTypeEntity(52, "落叶阔叶林");
        this.saveLandUseTypeEntity(56, "落叶针叶林");
        this.saveLandUseTypeEntity(60, "常绿阔叶林");
        this.saveLandUseTypeEntity(64, "常绿针叶林");
        this.saveLandUseTypeEntity(68, "湿地");
        this.saveLandUseTypeEntity(72, "多河流地区");
        this.saveLandUseTypeEntity(76, "荒地或少植物地区");
        this.saveLandUseTypeEntity(80, "冻土地区");
        this.saveLandUseTypeEntity(84, "冰雪地区");
        this.saveLandUseTypeEntity(99, "其它");

        this.saveMeaConPointGradeEntity(0, "未知");
        this.saveMeaConPointGradeEntity(1, "AA");
        this.saveMeaConPointGradeEntity(2, "A");
        this.saveMeaConPointGradeEntity(3, "B");
        this.saveMeaConPointGradeEntity(4, "C");
        this.saveMeaConPointGradeEntity(5, "D");
        this.saveMeaConPointGradeEntity(6, "E");
        this.saveMeaConPointGradeEntity(99, "其它");

        this.saveMeaConPointTypeEntity(0, "未知");
        this.saveMeaConPointTypeEntity(1, "大地原点");
        this.saveMeaConPointTypeEntity(2, "图根点");
        this.saveMeaConPointTypeEntity(3, "水准点");
        this.saveMeaConPointTypeEntity(4, "卫星定位连续运行站点");
        this.saveMeaConPointTypeEntity(5, "卫星定位等级点");
        this.saveMeaConPointTypeEntity(6, "重力点");
        this.saveMeaConPointTypeEntity(7, "独立天文点");
        this.saveMeaConPointTypeEntity(8, "测量控制点注记");
        this.saveMeaConPointTypeEntity(9, "管道永久 GPS 控制点");
        this.saveMeaConPointTypeEntity(99, "其它");

        this.saveMiscCrossingTypeEntity(0, "未知");
        this.saveMiscCrossingTypeEntity(1, "文物古迹");
        this.saveMiscCrossingTypeEntity(2, "土坝");
        this.saveMiscCrossingTypeEntity(3, "滩地");
        this.saveMiscCrossingTypeEntity(4, "保护区");
        this.saveMiscCrossingTypeEntity(5, "规划区");
        this.saveMiscCrossingTypeEntity(6, "经济作物区");
        this.saveMiscCrossingTypeEntity(7, "机场");
        this.saveMiscCrossingTypeEntity(8, "战备路穿越");
        this.saveMiscCrossingTypeEntity(99, "其它");

        this.saveMunicipalBndryTypeEntity(0, "未知");
        this.saveMunicipalBndryTypeEntity(1, "省");
        this.saveMunicipalBndryTypeEntity(2, "城市");
        this.saveMunicipalBndryTypeEntity(3, "县");
        this.saveMunicipalBndryTypeEntity(4, "镇");
        this.saveMunicipalBndryTypeEntity(5, "乡");
        this.saveMunicipalBndryTypeEntity(6, "村");
        this.saveMunicipalBndryTypeEntity(99, "其它");

        this.saveRailRoadTypeEntity(0, "未知");
        this.saveRailRoadTypeEntity(1, "单线铁路");
        this.saveRailRoadTypeEntity(2, "复线铁路");
        this.saveRailRoadTypeEntity(3, "铁路桥梁");
        this.saveRailRoadTypeEntity(4, "铁路隧道");
        this.saveRailRoadTypeEntity(99, "其它");

        this.saveResLocationEntity(0, "未知");
        this.saveResLocationEntity(1, "上游");
        this.saveResLocationEntity(2, "下游");
        this.saveResLocationEntity(99, "其它");

        this.saveRoadTypeEntity(0, "未知");
        this.saveRoadTypeEntity(10, "主要街道");
        this.saveRoadTypeEntity(14, "次要街道");
        this.saveRoadTypeEntity(18, "高速公路");
        this.saveRoadTypeEntity(22, "国道");
        this.saveRoadTypeEntity(26, "收费国道");
        this.saveRoadTypeEntity(30, "省道");
        this.saveRoadTypeEntity(34, "收费省道");
        this.saveRoadTypeEntity(38, "普通公路");
        this.saveRoadTypeEntity(42, "收费普通公路");
        this.saveRoadTypeEntity(46, "简易路");
        this.saveRoadTypeEntity(50, "大车路");
        this.saveRoadTypeEntity(54, "乡村路");
        this.saveRoadTypeEntity(58, "小路");
        this.saveRoadTypeEntity(62, "时令路");
        this.saveRoadTypeEntity(66, "伴行路");
        this.saveRoadTypeEntity(70, "过境公路");
        this.saveRoadTypeEntity(74, "隧道");
        this.saveRoadTypeEntity(78, "桥梁");
        this.saveRoadTypeEntity(82, "渡口");
        this.saveRoadTypeEntity(99, "其它");

        this.saveSlopeCodeEntity(0, "未知");
        this.saveSlopeCodeEntity(1, "小于 1%");
        this.saveSlopeCodeEntity(2, "1% - 2.15%");
        this.saveSlopeCodeEntity(3, "2.15% - 4.64%");
        this.saveSlopeCodeEntity(4, "4.64% - 10%");
        this.saveSlopeCodeEntity(5, "10% - 21.5%");
        this.saveSlopeCodeEntity(6, "21.5% - 46.4%");
        this.saveSlopeCodeEntity(7, "46.4% - 100%");
        this.saveSlopeCodeEntity(99, "无穷大");

        this.saveSoilDrainageEntity(0, "未知");
        this.saveSoilDrainageEntity(1, "排水性能差");
        this.saveSoilDrainageEntity(2, "排水性能一般");
        this.saveSoilDrainageEntity(3, "排水性能好");
        this.saveSoilDrainageEntity(99, "其它");

        this.saveSoilMICEntity(0, "未知");
        this.saveSoilMICEntity(1, "低");
        this.saveSoilMICEntity(2, "中等");
        this.saveSoilMICEntity(3, "高");
        this.saveSoilMICEntity(99, "其它");

        this.saveSoilStabilityEntity(0, "未知");
        this.saveSoilStabilityEntity(1, "稳定");
        this.saveSoilStabilityEntity(2, "不稳定");
        this.saveSoilStabilityEntity(3, "可能下陷");
        this.saveSoilStabilityEntity(4, "可能滑坡");
        this.saveSoilStabilityEntity(99, "其它");

        this.saveSoilTopographyEntity(0, "未知");
        this.saveSoilTopographyEntity(1, "平原");
        this.saveSoilTopographyEntity(2, "水道");
        this.saveSoilTopographyEntity(3, "山坡");
        this.saveSoilTopographyEntity(4, "缓坡");
        this.saveSoilTopographyEntity(5, "低洼区");
        this.saveSoilTopographyEntity(6, "滩涂");
        this.saveSoilTopographyEntity(7, "边坡");
        this.saveSoilTopographyEntity(8, "尖峰");
        this.saveSoilTopographyEntity(9, "波浪形山坡");
        this.saveSoilTopographyEntity(10, "阶地");
        this.saveSoilTopographyEntity(11, "冲沟");
        this.saveSoilTopographyEntity(12, "河流");
        this.saveSoilTopographyEntity(13, "小山坡");
        this.saveSoilTopographyEntity(14, "黄土型小山坡");
        this.saveSoilTopographyEntity(15, "黄土梯田小山坡");
        this.saveSoilTopographyEntity(16, "大型黄土山坡");
        this.saveSoilTopographyEntity(17, "山脉的缓坡地带");
        this.saveSoilTopographyEntity(18, "山谷");
        this.saveSoilTopographyEntity(19, "梯田小山坡");
        this.saveSoilTopographyEntity(99, "其它");

        this.saveSoilTypeEntity(0, "未知");
        this.saveSoilTypeEntity(10, "湿陷性黄土");
        this.saveSoilTypeEntity(15, "沙土");
        this.saveSoilTypeEntity(20, "粉质粘土");
        this.saveSoilTypeEntity(25, "砂岩/泥岩/砾岩风化土");
        this.saveSoilTypeEntity(30, "粘性土");
        this.saveSoilTypeEntity(35, "沙地");
        this.saveSoilTypeEntity(40, "沙砾地");
        this.saveSoilTypeEntity(45, "湖泊、河流、沟、排水沟、池塘");
        this.saveSoilTypeEntity(50, "淤泥滩");
        this.saveSoilTypeEntity(55, "干河床、干湖");
        this.saveSoilTypeEntity(60, "盐碱地");
        this.saveSoilTypeEntity(65, "石快地");
        this.saveSoilTypeEntity(70, "戈壁滩");
        this.saveSoilTypeEntity(99, "其它");

        this.saveSoilUseTopographyEntity(0, "未知");
        this.saveSoilUseTopographyEntity(1, "农田段");
        this.saveSoilUseTopographyEntity(2, "戈壁荒漠森林段");
        this.saveSoilUseTopographyEntity(99, "其他");
        this.saveSoilUseTopographyEntity(10, "湿陷性黄土");
        this.saveSoilUseTopographyEntity(15, "沙土");
        this.saveSoilUseTopographyEntity(20, "粉质粘土");
        this.saveSoilUseTopographyEntity(25, "砂岩/泥岩/砾岩风化土");
        this.saveSoilUseTopographyEntity(30, "粘性土");
        this.saveSoilUseTopographyEntity(35, "沙地");
        this.saveSoilUseTopographyEntity(40, "沙砾地");
        this.saveSoilUseTopographyEntity(45, "湖泊、河流、沟、排水沟、池塘");
        this.saveSoilUseTopographyEntity(50, "淤泥滩");
        this.saveSoilUseTopographyEntity(55, "干河床、干湖");
        this.saveSoilUseTopographyEntity(65, "石快地");
        this.saveSoilUseTopographyEntity(70, "戈壁滩");
        this.saveSoilUseTopographyEntity(60, "盐碱地");

        this.saveUtilityPointTypeEntity(0, "未知");
        this.saveUtilityPointTypeEntity(1, "油井(抽油机)");
        this.saveUtilityPointTypeEntity(2, "气井");
        this.saveUtilityPointTypeEntity(3, "变压器");
        this.saveUtilityPointTypeEntity(99, "其它");

        this.saveUtilityTypeEntity(0, "未知");
        this.saveUtilityTypeEntity(10, "地下电力电缆");
        this.saveUtilityTypeEntity(15, "污水管道");
        this.saveUtilityTypeEntity(20, "自来水管道");
        this.saveUtilityTypeEntity(25, "地下电话电缆\\光纤");
        this.saveUtilityTypeEntity(30, "有线电视电缆");
        this.saveUtilityTypeEntity(35, "高压电线");
        this.saveUtilityTypeEntity(40, "高架电话线\\光线");
        this.saveUtilityTypeEntity(50, "索道");
        this.saveUtilityTypeEntity(60, "实体墙");
        this.saveUtilityTypeEntity(65, "栅栏");
        this.saveUtilityTypeEntity(70, "城市热力管网");
        this.saveUtilityTypeEntity(99, "其它");

        this.saveWindDirectionEntity(0, "未知");
        this.saveWindDirectionEntity(1, "东");
        this.saveWindDirectionEntity(2, "南");
        this.saveWindDirectionEntity(3, "西");
        this.saveWindDirectionEntity(4, "北");
        this.saveWindDirectionEntity(5, "东北");
        this.saveWindDirectionEntity(6, "西北");
        this.saveWindDirectionEntity(7, "东南");
        this.saveWindDirectionEntity(8, "西南");
        this.saveWindDirectionEntity(99, "其它");

        this.saveManagerStatusEntity(1, "考核");
        this.saveManagerStatusEntity(2, "管理");
        this.saveManagerStatusEntity(3, "部分管理(封存)");
        this.saveManagerStatusEntity(4, "不管理(废弃)");
        this.saveManagerStatusEntity(99, "准备");

        this.saveClassTypeEntity(0, "未知");
        this.saveClassTypeEntity(1, "等级1-在规定面积内少于15户");
        this.saveClassTypeEntity(2, "等级2-在规定面积内多于15户少于100户");
        this.saveClassTypeEntity(3, "等级3-在规定面积内多于100户");
        this.saveClassTypeEntity(4, "等级4-交通发达的城镇、商业区");
        this.saveClassTypeEntity(99, "其它");

        this.saveDisasterTypeEntity(1, "粘土滑坡");
        this.saveDisasterTypeEntity(2, "碎石土滑坡");
        this.saveDisasterTypeEntity(3, "黄土滑坡");
        this.saveDisasterTypeEntity(4, "岩体滑坡");
        this.saveDisasterTypeEntity(5, "崩塌");
        this.saveDisasterTypeEntity(6, "泥石流");
        this.saveDisasterTypeEntity(7, "采空区塌陷");
        this.saveDisasterTypeEntity(8, "坡面水毁");
        this.saveDisasterTypeEntity(9, "河沟道水毁");
        this.saveDisasterTypeEntity(10, "台田地水毁");
        this.saveDisasterTypeEntity(11, "黄土湿陷");
        this.saveDisasterTypeEntity(12, "盐渍土");
        this.saveDisasterTypeEntity(13, "冻土");
        this.saveDisasterTypeEntity(14, "岩溶塌陷");
        this.saveDisasterTypeEntity(15, "地面沉降");
        this.saveDisasterTypeEntity(16, "地裂缝");
        this.saveDisasterTypeEntity(17, "地震液化");
        this.saveDisasterTypeEntity(18, "水化学腐蚀");
        this.saveDisasterTypeEntity(19, "人类工程活动");

        this.saveEasyAreaTypeEntity(1, "高");
        this.saveEasyAreaTypeEntity(2, "中");
        this.saveEasyAreaTypeEntity(3, "低");

        this.saveFailureModeEntity(0, "未知");
        this.saveFailureModeEntity(1, "腐蚀");
        this.saveFailureModeEntity(2, "裂纹");
        this.saveFailureModeEntity(3, "泄露");
        this.saveFailureModeEntity(4, "爆裂");
        this.saveFailureModeEntity(5, "爆炸");
        this.saveFailureModeEntity(6, "盗油点");
        this.saveFailureModeEntity(99, "其它");

        this.saveFailureTypeEntity("UNK", "未知");
        this.saveFailureTypeEntity("CD", "建造缺陷");
        this.saveFailureTypeEntity("EC", "外部腐蚀");
        this.saveFailureTypeEntity("HYDRO", "水压试验失效");
        this.saveFailureTypeEntity("IC", "内部腐蚀");
        this.saveFailureTypeEntity("MAN", "制造有关的缺陷");
        this.saveFailureTypeEntity("MD", "机械损伤");
        this.saveFailureTypeEntity("OF", "外力");
        this.saveFailureTypeEntity("SCC", "应力裂纹腐蚀");
        this.saveFailureTypeEntity("SM", "土壤移动");
        this.saveFailureTypeEntity("OTHR", "其它");

        this.saveHCATypeEntity(0, "未知");
        this.saveHCATypeEntity(1, "高人口密度区");
        this.saveHCATypeEntity(2, "其它人口密集区");
        this.saveHCATypeEntity(3, "河流水源");
        this.saveHCATypeEntity(4, "交通设施");
        this.saveHCATypeEntity(5, "生态保护区");
        this.saveHCATypeEntity(99, "其它");

        this.saveOperatingPressureEntity(0, "MinValue");
        this.saveOperatingPressureEntity(15, "MaxValue");

        this.savePatrolPeriodsEntity(0, "未知");
        this.savePatrolPeriodsEntity(1, "每年一次或者周期更长");
        this.savePatrolPeriodsEntity(2, "半年一次");
        this.savePatrolPeriodsEntity(3, "一月一次");
        this.savePatrolPeriodsEntity(4, "两周一次");
        this.savePatrolPeriodsEntity(5, "每周一次");
        this.savePatrolPeriodsEntity(6, "一周两次");
        this.savePatrolPeriodsEntity(7, "一周三次");
        this.savePatrolPeriodsEntity(8, "一天一次");
        this.savePatrolPeriodsEntity(9, "一天两次");
        this.savePatrolPeriodsEntity(10, "一刻钟一次");
        this.savePatrolPeriodsEntity(11, "一天三次");
        this.savePatrolPeriodsEntity(99, "其它");

        this.savePatrolTypeEntity(0, "未知");
        this.savePatrolTypeEntity(1, "地面巡检");
        this.savePatrolTypeEntity(2, "飞行巡检");
        this.savePatrolTypeEntity(99, "其它");

        this.savePressureTestTypeEntity(0, "未知");
        this.savePressureTestTypeEntity(1, "强度试压");
        this.savePressureTestTypeEntity(2, "严密性试压");
        this.savePressureTestTypeEntity(99, "其它");

        this.savePressureTypeEntity(0, "未知");
        this.savePressureTypeEntity(1, "运行压力");
        this.savePressureTypeEntity(2, "设计压力");
        this.savePressureTypeEntity(3, "最大许可运行压力");
        this.savePressureTypeEntity(4, "最大运行压力");
        this.savePressureTypeEntity(99, "其它");

        this.savePresTestMediumEntity(0, "未知");
        this.savePresTestMediumEntity(1, "空气");
        this.savePresTestMediumEntity(2, "洁净水");
        this.savePresTestMediumEntity(3, "惰性气体");
        this.savePresTestMediumEntity(4, "天然气");
        this.savePresTestMediumEntity(99, "其它");

        this.saveRiskLevelEntity(0, "未知");
        this.saveRiskLevelEntity(1, "轻微");
        this.saveRiskLevelEntity(2, "小");
        this.saveRiskLevelEntity(3, "中等");
        this.saveRiskLevelEntity(4, "大");
        this.saveRiskLevelEntity(99, "其它");

        this.saveRiskTypeEntity(1, "泥石流");
        this.saveRiskTypeEntity(2, "洪水冲刷");
        this.saveRiskTypeEntity(3, "盐渍土腐蚀");
        this.saveRiskTypeEntity(4, "沙埋风蚀");
        this.saveRiskTypeEntity(5, "地震带");
        this.saveRiskTypeEntity(6, "河岸崩塌");
        this.saveRiskTypeEntity(7, "矿区采空地面塌陷");
        this.saveRiskTypeEntity(8, "煤层自燃");
        this.saveRiskTypeEntity(9, "黄土湿陷与潜蚀");
        this.saveRiskTypeEntity(10, "地裂缝");
        this.saveRiskTypeEntity(11, "地面沉降");
        this.saveRiskTypeEntity(12, "膨胀土");
        this.saveRiskTypeEntity(13, "滑坡");
        this.saveRiskTypeEntity(14, "地面塌陷");
        this.saveRiskTypeEntity(15, "永冻区");
        this.saveRiskTypeEntity(16, "腐蚀");
        this.saveRiskTypeEntity(17, "高陡边坡");
        this.saveRiskTypeEntity(18, "黄土崾岘");
        this.saveRiskTypeEntity(19, "砂土液化");
        this.saveRiskTypeEntity(20, "山体崩塌");
        this.saveRiskTypeEntity(21, "水土流失");
        this.saveRiskTypeEntity(22, "瓦斯突出");
        this.saveRiskTypeEntity(99, "其它");
    }

    private void deleteDictionaryKeyValue() {
        activityTypeRepository.deleteAll();
        alarmSystemRepository.deleteAll();
        appurtenanceTypeRepository.deleteAll();
        aspectCodeRepository.deleteAll();
        bendAngleRepository.deleteAll();
        breakePointRateRepository.deleteAll();
        cableCoatingRepository.deleteAll();
        cableSizeRepository.deleteAll();
        cableTypeRepository.deleteAll();
        casingFillMaterialRepository.deleteAll();
        casingSealTypeRepository.deleteAll();
        casingTypeRepository.deleteAll();
        catalogRepository.deleteAll();
        classTypeRepository.deleteAll();
        closureTypeRepository.deleteAll();
        coatingConditionRepository.deleteAll();
        coatingMaterialRepository.deleteAll();
        coatingSourceRepository.deleteAll();
        comeFromFlagRepository.deleteAll();
        companyTypeRepository.deleteAll();
        contactTypeRepository.deleteAll();
        contractTypeRepository.deleteAll();
        controlPointTypeRepository.deleteAll();
        coodiPrecisionRepository.deleteAll();
        corrosionDegreeRepository.deleteAll();
        cpPowerWorkTypeRepository.deleteAll();
        cpStatusRepository.deleteAll();
        crackTypeRepository.deleteAll();
        crossingMethodRepository.deleteAll();
        crossingObjectRepository.deleteAll();
        crossingStatusRepository.deleteAll();
        currentTypeRepository.deleteAll();
        dataResolutionRepository.deleteAll();
        dataSourceRepository.deleteAll();
        dataStatusRepository.deleteAll();
        daysOfWeekRepository.deleteAll();
        defectiveConditionRepository.deleteAll();
        dentTypeRepository.deleteAll();
        detectionTypeRepository.deleteAll();
        disasterTypeRepository.deleteAll();
        disturbanceRepository.deleteAll();
        easyAreaTypeRepository.deleteAll();
        elbowAngleRepository.deleteAll();
        elbowTypeRepository.deleteAll();
        emergencyServiceRepository.deleteAll();
        evaluationResultsRepository.deleteAll();
        failureModeRepository.deleteAll();
        failureTypeRepository.deleteAll();
        faultLineDirectionRepository.deleteAll();
        faultTypeRepository.deleteAll();
        fcrepStatusRepository.deleteAll();
        featureClassRepository.deleteAll();
        fittingMaterialRepository.deleteAll();
        floodClassRepository.deleteAll();
        floodProMaterialTypeRepository.deleteAll();
        floodProTypeRepository.deleteAll();
        forignPipeTypeRepository.deleteAll();
        galvanicAnodeMaterialRepository.deleteAll();
        galvanicAnodeWeightRepository.deleteAll();
        gbBackFillMaterialRepository.deleteAll();
        gbStructureRepository.deleteAll();
        geoRiskMeasureRepository.deleteAll();
        gradeRepository.deleteAll();
        hcaTypeRepository.deleteAll();
        hydroTypeRepository.deleteAll();
        inspectionMethodRepository.deleteAll();
        integrityProposalRepository.deleteAll();
        internalExternalRepository.deleteAll();
        jointCoatingTypeRepository.deleteAll();
        landUseTypeRepository.deleteAll();
        lifeCycleRepository.deleteAll();
        lineTypeRepository.deleteAll();
        managerStatusRepository.deleteAll();
        markerStatusRepository.deleteAll();
        markerTypeRepository.deleteAll();
        meaConPointGradeRepository.deleteAll();
        meaConPointTypeRepository.deleteAll();
        mediaTypeRepository.deleteAll();
        mediumTypeRepository.deleteAll();
        metalLossTypeRepository.deleteAll();
        miscCrossingTypeRepository.deleteAll();
        municipalBndryTypeRepository.deleteAll();
        ndtTypeRepository.deleteAll();
        nspPipeMaterialRepository.deleteAll();
        nspPipeTypeRepository.deleteAll();
        operatingPressureRepository.deleteAll();
        operationalStatusRepository.deleteAll();
        operatorTypeRepository.deleteAll();
        patrolPeriodsRepository.deleteAll();
        patrolTypeRepository.deleteAll();
        repstatusRepository.deleteAll();
        pcmdcacRepository.deleteAll();
        percentageRepository.deleteAll();
        pipeDiameterRepository.deleteAll();
        pigStructureTypeRepository.deleteAll();
        pipeJoinTypeRepository.deleteAll();
        pipelineDiameterRepository.deleteAll();
        pipeRepairRepository.deleteAll();
        pipeRepMethodRepository.deleteAll();
        pipeSeamTypeRepository.deleteAll();
        pipeSegMaterialRepository.deleteAll();
        pipeSegTypeRepository.deleteAll();
        powerOperatingAmpsOutRepository.deleteAll();
        powerOperatingVoltsOutRepository.deleteAll();
        powerProtectTypeRepository.deleteAll();
        powerRatedAmpsOutRepository.deleteAll();
        powerRatedVoltsOutRepository.deleteAll();
        powerTypeRepository.deleteAll();
        pressureRatingRepository.deleteAll();
        pressureTestTypeRepository.deleteAll();
        pressureTypeRepository.deleteAll();
        pressureUnitRepository.deleteAll();
        presTestMediumRepository.deleteAll();
        productRepository.deleteAll();
        projectTypeRepository.deleteAll();
        qualityRatingRepository.deleteAll();
        railRoadTypeRepository.deleteAll();
        reducerSizeRepository.deleteAll();
        reducerTypeRepository.deleteAll();
        repairLanTypeRepository.deleteAll();
        regionCompanyRepository.deleteAll();
        repairMethodTypeRepository.deleteAll();
        repairStatusRepository.deleteAll();
        resLocationRepository.deleteAll();
        riskGradeRepository.deleteAll();
        riskLevelRepository.deleteAll();
        riskMeasureRepository.deleteAll();
        riskTypeRepository.deleteAll();
        roadTypeRepository.deleteAll();
        rowPermitTypeRepository.deleteAll();
        rowTypeRepository.deleteAll();
        rsikFactorRepository.deleteAll();
        seriesTypeRepository.deleteAll();
        sheetTypeRepository.deleteAll();
        signTypeRepository.deleteAll();
        slopeCodeRepository.deleteAll();
        soilDrainageRepository.deleteAll();
        soilMICRepository.deleteAll();
        soilStabilityRepository.deleteAll();
        soilTestResultsRepository.deleteAll();
        soilTopographyRepository.deleteAll();
        soilTypeRepository.deleteAll();
        soilUseTopographyRepository.deleteAll();
        strainDirectionTypeRepository.deleteAll();
        strengthRatingRepository.deleteAll();
        structureTypeRepository.deleteAll();
        subSystemTypeRepository.deleteAll();
        systemMetaRepository.deleteAll();
        systemPrincipleRepository.deleteAll();
        systemTypeRepository.deleteAll();
        tapFlowDirectionRepository.deleteAll();
        tapSizeRepository.deleteAll();
        tapTypeRepository.deleteAll();
        teeSizeRepository.deleteAll();
        useAvgRateRepository.deleteAll();
        teeTypeRepository.deleteAll();
        useMaxRateRepository.deleteAll();
        utilityPointTypeRepository.deleteAll();
        utilityTypeRepository.deleteAll();
        valveFunctionRepository.deleteAll();
        valveOperatorTypeRepository.deleteAll();
        valvePositionRepository.deleteAll();
        valveTypeRepository.deleteAll();
        wallThicknessRepository.deleteAll();
        weeksPerYearRepository.deleteAll();
        weldConditionRepository.deleteAll();
        weldDefTypeRepository.deleteAll();
        weldTypeRepository.deleteAll();
        windDirectionRepository.deleteAll();
        yesNoRepository.deleteAll();
        featureTypeRepository.deleteAll();
    }

    private void saveWeldDefTypeEntity(Integer value, String name, String featureTypeValue) {
        WeldDefTypeEntity weldDefTypeEntity = new WeldDefTypeEntity();
        weldDefTypeEntity.setValue(value);
        weldDefTypeEntity.setName(name);
        FeatureTypeEntity featureTypeEntity = getFeatureTypeEntityByValue(featureTypeValue);
        weldDefTypeEntity.setFeatureTypeEntityById(featureTypeEntity);
        weldDefTypeRepository.save(weldDefTypeEntity);
    }

    private void saveUseMaxRateEntity(Integer value, String name) {
        UseMaxRateEntity useMaxRateEntity = new UseMaxRateEntity();
        useMaxRateEntity.setValue(value);
        useMaxRateEntity.setName(name);
        useMaxRateRepository.save(useMaxRateEntity);
    }

    private void saveUseAvgRateEntity(Integer value, String name) {
        UseAvgRateEntity useAvgRateEntity = new UseAvgRateEntity();
        useAvgRateEntity.setValue(value);
        useAvgRateEntity.setName(name);
        useAvgRateRepository.save(useAvgRateEntity);
    }

    private void saveStrainDirectionTypeEntity(Integer value, String name) {
        StrainDirectionTypeEntity strainDirectionTypeEntity = new StrainDirectionTypeEntity();
        strainDirectionTypeEntity.setValue(value);
        strainDirectionTypeEntity.setName(name);
        strainDirectionTypeRepository.save(strainDirectionTypeEntity);
    }

    private void saveRailRoadTypeEntity(Integer value, String name) {
        RailRoadTypeEntity railRoadTypeEntity = new RailRoadTypeEntity();
        railRoadTypeEntity.setValue(value);
        railRoadTypeEntity.setName(name);
        railRoadTypeRepository.save(railRoadTypeEntity);
    }

    private void saveResLocationEntity(Integer value, String name) {
        ResLocationEntity resLocationEntity = new ResLocationEntity();
        resLocationEntity.setValue(value);
        resLocationEntity.setName(name);
        resLocationRepository.save(resLocationEntity);
    }

    private void saveRoadTypeEntity(Integer value, String name) {
        RoadTypeEntity roadTypeEntity = new RoadTypeEntity();
        roadTypeEntity.setValue(value);
        roadTypeEntity.setName(name);
        roadTypeRepository.save(roadTypeEntity);
    }

    private void saveSlopeCodeEntity(Integer value, String name) {
        SlopeCodeEntity slopeCodeEntity = new SlopeCodeEntity();
        slopeCodeEntity.setValue(value);
        slopeCodeEntity.setName(name);
        slopeCodeRepository.save(slopeCodeEntity);
    }

    private void saveSoilDrainageEntity(Integer value, String name) {
        SoilDrainageEntity soilDrainageEntity = new SoilDrainageEntity();
        soilDrainageEntity.setValue(value);
        soilDrainageEntity.setName(name);
        soilDrainageRepository.save(soilDrainageEntity);
    }

    private void saveSoilMICEntity(Integer value, String name) {
        SoilMICEntity soilMICEntity = new SoilMICEntity();
        soilMICEntity.setValue(value);
        soilMICEntity.setName(name);
        soilMICRepository.save(soilMICEntity);
    }

    private void saveSoilStabilityEntity(Integer value, String name) {
        SoilStabilityEntity soilStabilityEntity = new SoilStabilityEntity();
        soilStabilityEntity.setValue(value);
        soilStabilityEntity.setName(name);
        soilStabilityRepository.save(soilStabilityEntity);
    }

    private void saveSoilTopographyEntity(Integer value, String name) {
        SoilTopographyEntity soilTopographyEntity = new SoilTopographyEntity();
        soilTopographyEntity.setValue(value);
        soilTopographyEntity.setName(name);
        soilTopographyRepository.save(soilTopographyEntity);
    }

    private void saveSoilTypeEntity(Integer value, String name) {
        SoilTypeEntity soilTypeEntity = new SoilTypeEntity();
        soilTypeEntity.setValue(value);
        soilTypeEntity.setName(name);
        soilTypeRepository.save(soilTypeEntity);
    }

    private void saveSoilUseTopographyEntity(Integer value, String name) {
        SoilUseTopographyEntity soilUseTopographyEntity = new SoilUseTopographyEntity();
        soilUseTopographyEntity.setValue(value);
        soilUseTopographyEntity.setName(name);
        soilUseTopographyRepository.save(soilUseTopographyEntity);
    }

    private void saveUtilityPointTypeEntity(Integer value, String name) {
        UtilityPointTypeEntity utilityPointTypeEntity = new UtilityPointTypeEntity();
        utilityPointTypeEntity.setValue(value);
        utilityPointTypeEntity.setName(name);
        utilityPointTypeRepository.save(utilityPointTypeEntity);
    }

    private void saveUtilityTypeEntity(Integer value, String name) {
        UtilityTypeEntity utilityTypeEntity = new UtilityTypeEntity();
        utilityTypeEntity.setValue(value);
        utilityTypeEntity.setName(name);
        utilityTypeRepository.save(utilityTypeEntity);
    }

    private void saveRepairStatusEntity(Integer value, String name) {
        RepairStatusEntity repairStatusEntity = new RepairStatusEntity();
        repairStatusEntity.setValue(value);
        repairStatusEntity.setName(name);
        repairStatusRepository.save(repairStatusEntity);
    }

    private void saveWindDirectionEntity(Integer value, String name) {
        WindDirectionEntity windDirectionEntity = new WindDirectionEntity();
        windDirectionEntity.setValue(value);
        windDirectionEntity.setName(name);
        windDirectionRepository.save(windDirectionEntity);
    }

    private void savePressureTypeEntity(Integer value, String name) {
        PressureTypeEntity pressureTypeEntity = new PressureTypeEntity();
        pressureTypeEntity.setValue(value);
        pressureTypeEntity.setName(name);
        pressureTypeRepository.save(pressureTypeEntity);
    }

    private void savePresTestMediumEntity(Integer value, String name) {
        PresTestMediumEntity presTestMediumEntity = new PresTestMediumEntity();
        presTestMediumEntity.setValue(value);
        presTestMediumEntity.setName(name);
        presTestMediumRepository.save(presTestMediumEntity);
    }

    private void saveRiskLevelEntity(Integer value, String name) {
        RiskLevelEntity riskLevelEntity = new RiskLevelEntity();
        riskLevelEntity.setValue(value);
        riskLevelEntity.setName(name);
        riskLevelRepository.save(riskLevelEntity);
    }

    private void saveRiskTypeEntity(Integer value, String name) {
        RiskTypeEntity riskTypeEntity = new RiskTypeEntity();
        riskTypeEntity.setValue(value);
        riskTypeEntity.setName(name);
        riskTypeRepository.save(riskTypeEntity);
    }

    private void savePressureUnitEntity(Integer value, String name) {
        PressureUnitEntity pressureUnitEntity = new PressureUnitEntity();
        pressureUnitEntity.setValue(value);
        pressureUnitEntity.setName(name);
        pressureUnitRepository.save(pressureUnitEntity);
    }

    private void saveYesNoEntity(Integer value, String name) {
        YesNoEntity yesNoEntity = new YesNoEntity();
        yesNoEntity.setValue(value);
        yesNoEntity.setName(name);
        yesNoRepository.save(yesNoEntity);
    }

    private void saveSystemPrincipleEntity(Integer value, String name) {
        SystemPrincipleEntity systemPrincipleEntity = new SystemPrincipleEntity();
        systemPrincipleEntity.setValue(value);
        systemPrincipleEntity.setName(name);
        systemPrincipleRepository.save(systemPrincipleEntity);
    }

    private void saveSystemTypeEntity(Integer value, String name) {
        SystemTypeEntity systemTypeEntity = new SystemTypeEntity();
        systemTypeEntity.setValue(value);
        systemTypeEntity.setName(name);
        systemTypeRepository.save(systemTypeEntity);
    }

    private void saveRsikFactorEntity(Integer value, String name) {
        RsikFactorEntity rsikFactorEntity = new RsikFactorEntity();
        rsikFactorEntity.setValue(value);
        rsikFactorEntity.setName(name);
        rsikFactorRepository.save(rsikFactorEntity);
    }

    private void saveRiskMeasureEntity(Integer value, String name) {
        RiskMeasureEntity riskMeasureEntity = new RiskMeasureEntity();
        riskMeasureEntity.setValue(value);
        riskMeasureEntity.setName(name);
        riskMeasureRepository.save(riskMeasureEntity);
    }

    private void saveProjectTypeEntity(Integer value, String name) {
        ProjectTypeEntity projectTypeEntity = new ProjectTypeEntity();
        projectTypeEntity.setValue(value);
        projectTypeEntity.setName(name);
        projectTypeRepository.save(projectTypeEntity);
    }

    private void saveWeldTypeEntity(Integer value, String name) {
        WeldTypeEntity weldTypeEntity = new WeldTypeEntity();
        weldTypeEntity.setValue(value);
        weldTypeEntity.setName(name);
        weldTypeRepository.save(weldTypeEntity);
    }

    private void saveWeldConditionEntity(Integer value, String name) {
        WeldConditionEntity weldConditionEntity = new WeldConditionEntity();
        weldConditionEntity.setValue(value);
        weldConditionEntity.setName(name);
        weldConditionRepository.save(weldConditionEntity);
    }

    private void saveWallThicknessEntity(Integer value, String name) {
        WallThicknessEntity wallThicknessEntity = new WallThicknessEntity();
        wallThicknessEntity.setValue(value);
        wallThicknessEntity.setName(name);
        wallThicknessRepository.save(wallThicknessEntity);
    }

    private void saveValveTypeEntity(Integer value, String name) {
        ValveTypeEntity valveTypeEntity = new ValveTypeEntity();
        valveTypeEntity.setValue(value);
        valveTypeEntity.setName(name);
        valveTypeRepository.save(valveTypeEntity);
    }

    private void saveValvePositionEntity(Integer value, String name) {
        ValvePositionEntity valvePositionEntity = new ValvePositionEntity();
        valvePositionEntity.setValue(value);
        valvePositionEntity.setName(name);
        valvePositionRepository.save(valvePositionEntity);
    }

    private void saveValveOperatorTypeEntity(Integer value, String name) {
        ValveOperatorTypeEntity valveOperatorTypeEntity = new ValveOperatorTypeEntity();
        valveOperatorTypeEntity.setValue(value);
        valveOperatorTypeEntity.setName(name);
        valveOperatorTypeRepository.save(valveOperatorTypeEntity);
    }

    private void saveValveFunctionEntity(Integer value, String name) {
        ValveFunctionEntity valveFunctionEntity = new ValveFunctionEntity();
        valveFunctionEntity.setValue(value);
        valveFunctionEntity.setName(name);
        valveFunctionRepository.save(valveFunctionEntity);
    }

    private void saveTeeTypeEntity(Integer value, String name) {
        TeeTypeEntity teeTypeEntity = new TeeTypeEntity();
        teeTypeEntity.setValue(value);
        teeTypeEntity.setName(name);
        teeTypeRepository.save(teeTypeEntity);
    }

    private void saveTeeSizeEntity(Integer value, String name) {
        TeeSizeEntity teeSizeEntity = new TeeSizeEntity();
        teeSizeEntity.setValue(value);
        teeSizeEntity.setName(name);
        teeSizeRepository.save(teeSizeEntity);
    }

    private void saveTapTypeEntity(Integer value, String name) {
        TapTypeEntity tapTypeEntity = new TapTypeEntity();
        tapTypeEntity.setValue(value);
        tapTypeEntity.setName(name);
        tapTypeRepository.save(tapTypeEntity);
    }

    private void saveTapSizeEntity(Integer value, String name) {
        TapSizeEntity tapSizeEntity = new TapSizeEntity();
        tapSizeEntity.setValue(value);
        tapSizeEntity.setName(name);
        tapSizeRepository.save(tapSizeEntity);
    }

    private void saveTapFlowDirectionEntity(Integer value, String name) {
        TapFlowDirectionEntity tapFlowDirectionEntity = new TapFlowDirectionEntity();
        tapFlowDirectionEntity.setValue(value);
        tapFlowDirectionEntity.setName(name);
        tapFlowDirectionRepository.save(tapFlowDirectionEntity);
    }

    private void saveStrengthRatingEntity(Integer value, String name) {
        StrengthRatingEntity strengthRatingEntity = new StrengthRatingEntity();
        strengthRatingEntity.setValue(value);
        strengthRatingEntity.setName(name);
        strengthRatingRepository.save(strengthRatingEntity);
    }

    private void saveSoilTestResultsEntity(Integer value, String name) {
        SoilTestResultsEntity soilTestResultsEntity = new SoilTestResultsEntity();
        soilTestResultsEntity.setValue(value);
        soilTestResultsEntity.setName(name);
        soilTestResultsRepository.save(soilTestResultsEntity);
    }

    private void saveRiskGradeEntity(Integer value, String name) {
        RiskGradeEntity riskGradeEntity = new RiskGradeEntity();
        riskGradeEntity.setValue(value);
        riskGradeEntity.setName(name);
        riskGradeRepository.save(riskGradeEntity);
    }

    private void saveRepstatusEntity(Integer value, String name) {
        RepstatusEntity repstatusEntity = new RepstatusEntity();
        repstatusEntity.setValue(value);
        repstatusEntity.setName(name);
        repstatusRepository.save(repstatusEntity);
    }

    private void saveRepairMethodTypeEntity(Integer value, String name) {
        RepairMethodTypeEntity repairMethodTypeEntity = new RepairMethodTypeEntity();
        repairMethodTypeEntity.setValue(value);
        repairMethodTypeEntity.setName(name);
        repairMethodTypeRepository.save(repairMethodTypeEntity);
    }

    private void saveRepairLanTypeEntity(Integer value, String name) {
        RepairLanTypeEntity repairLanTypeEntity = new RepairLanTypeEntity();
        repairLanTypeEntity.setValue(value);
        repairLanTypeEntity.setName(name);
        repairLanTypeRepository.save(repairLanTypeEntity);
    }

    private void saveRegionCompanyEntity(Integer value, String name) {
        RegionCompanyEntity regionCompanyEntity = new RegionCompanyEntity();
        regionCompanyEntity.setValue(value);
        regionCompanyEntity.setName(name);
        regionCompanyRepository.save(regionCompanyEntity);
    }

    private void saveReducerTypeEntity(Integer value, String name) {
        ReducerTypeEntity reducerTypeEntity = new ReducerTypeEntity();
        reducerTypeEntity.setValue(value);
        reducerTypeEntity.setName(name);
        reducerTypeRepository.save(reducerTypeEntity);
    }

    private void saveReducerSizeEntity(String value, String name) {
        ReducerSizeEntity reducerSizeEntity = new ReducerSizeEntity();
        reducerSizeEntity.setValue(value);
        reducerSizeEntity.setName(name);
        reducerSizeRepository.save(reducerSizeEntity);
    }

    private void saveQualityRatingEntity(Integer value, String name) {
        QualityRatingEntity qualityRatingEntity = new QualityRatingEntity();
        qualityRatingEntity.setValue(value);
        qualityRatingEntity.setName(name);
        qualityRatingRepository.save(qualityRatingEntity);
    }

    private void saveNSPPipeTypeEntity(Integer value, String name) {
        NSPPipeTypeEntity nspPipeTypeEntity = new NSPPipeTypeEntity();
        nspPipeTypeEntity.setValue(value);
        nspPipeTypeEntity.setName(name);
        nspPipeTypeRepository.save(nspPipeTypeEntity);
    }

    private void saveWeeksPerYearEntity(Integer value, String name) {
        WeeksPerYearEntity weeksPerYearEntity = new WeeksPerYearEntity();
        weeksPerYearEntity.setValue(value);
        weeksPerYearEntity.setName(name);
        weeksPerYearRepository.save(weeksPerYearEntity);
    }

    private void saveStructureTypeEntity(Integer value, String name) {
        StructureTypeEntity structureTypeEntity = new StructureTypeEntity();
        structureTypeEntity.setValue(value);
        structureTypeEntity.setName(name);
        structureTypeRepository.save(structureTypeEntity);
    }

    private void saveSignTypeEntity(Integer value, String name) {
        SignTypeEntity signTypeEntity = new SignTypeEntity();
        signTypeEntity.setValue(value);
        signTypeEntity.setName(name);
        signTypeRepository.save(signTypeEntity);
    }

    private void saveROWTypeEntity(Integer value, String name) {
        ROWTypeEntity rowTypeEntity = new ROWTypeEntity();
        rowTypeEntity.setValue(value);
        rowTypeEntity.setName(name);
        rowTypeRepository.save(rowTypeEntity);
    }

    private void saveROWPermitTypeEntity(Integer value, String name) {
        ROWPermitTypeEntity rowPermitTypeEntity = new ROWPermitTypeEntity();
        rowPermitTypeEntity.setValue(value);
        rowPermitTypeEntity.setName(name);
        rowPermitTypeRepository.save(rowPermitTypeEntity);
    }

    private void saveSubSystemTypeEntity(Integer value, String name) {
        SubSystemTypeEntity subSystemTypeEntity = new SubSystemTypeEntity();
        subSystemTypeEntity.setValue(value);
        subSystemTypeEntity.setName(name);
        subSystemTypeRepository.save(subSystemTypeEntity);
    }

    private void saveSeriesTypeEntity(String value, String name) {
        SeriesTypeEntity seriesTypeEntity = new SeriesTypeEntity();
        seriesTypeEntity.setValue(value);
        seriesTypeEntity.setName(name);
        seriesTypeRepository.save(seriesTypeEntity);
    }

    private void saveProductEntity(Integer value, String name) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setValue(value);
        productEntity.setName(name);
        productRepository.save(productEntity);
    }

    private void saveSheetTypeEntity(Integer value, String name) {
        SheetTypeEntity sheetTypeEntity = new SheetTypeEntity();
        sheetTypeEntity.setValue(value);
        sheetTypeEntity.setName(name);
        sheetTypeRepository.save(sheetTypeEntity);
    }

    private void saveActivityTypeEntity(Integer value, String name) {
        ActivityTypeEntity activityTypeEntity = new ActivityTypeEntity();
        activityTypeEntity.setValue(value);
        activityTypeEntity.setName(name);
        activityTypeRepository.save(activityTypeEntity);
    }

    private void saveAlarmSystemEntity(Integer value, String name) {
        AlarmSystemEntity alarmSystemEntity = new AlarmSystemEntity();
        alarmSystemEntity.setValue(value);
        alarmSystemEntity.setName(name);
        alarmSystemRepository.save(alarmSystemEntity);
    }

    private void saveAppurtenanceTypeEntity(String value, String name) {
        AppurtenanceTypeEntity appurtenanceTypeEntity = new AppurtenanceTypeEntity();
        appurtenanceTypeEntity.setValue(value);
        appurtenanceTypeEntity.setName(name);
        appurtenanceTypeRepository.save(appurtenanceTypeEntity);
    }

    private void saveAspectCodeEntity(Integer value, String name) {
        AspectCodeEntity aspectCodeEntity = new AspectCodeEntity();
        aspectCodeEntity.setValue(value);
        aspectCodeEntity.setName(name);
        aspectCodeRepository.save(aspectCodeEntity);
    }

    private void saveBendAngleEntity(Integer value, String name) {
        BendAngleEntity bendAngleEntity = new BendAngleEntity();
        bendAngleEntity.setValue(value);
        bendAngleEntity.setName(name);
        bendAngleRepository.save(bendAngleEntity);
    }

    private void saveBreakePointRateEntity(Integer value, String name) {
        BreakePointRateEntity breakePointRateEntity = new BreakePointRateEntity();
        breakePointRateEntity.setValue(value);
        breakePointRateEntity.setName(name);
        breakePointRateRepository.save(breakePointRateEntity);
    }

    private void saveCableCoatingEntity(Integer value, String name) {
        CableCoatingEntity cableCoatingEntity = new CableCoatingEntity();
        cableCoatingEntity.setValue(value);
        cableCoatingEntity.setName(name);
        cableCoatingRepository.save(cableCoatingEntity);
    }

    private void saveCableSizeEntity(Integer value, String name) {
        CableSizeEntity cableSizeEntity = new CableSizeEntity();
        cableSizeEntity.setValue(value);
        cableSizeEntity.setName(name);
        cableSizeRepository.save(cableSizeEntity);
    }

    private void saveCableTypeEntity(Integer value, String name) {
        CableTypeEntity cableTypeEntity = new CableTypeEntity();
        cableTypeEntity.setValue(value);
        cableTypeEntity.setName(name);
        cableTypeRepository.save(cableTypeEntity);
    }

    private void saveCasingFillMaterialEntity(Integer value, String name) {
        CasingFillMaterialEntity casingFillMaterialEntity = new CasingFillMaterialEntity();
        casingFillMaterialEntity.setValue(value);
        casingFillMaterialEntity.setName(name);
        casingFillMaterialRepository.save(casingFillMaterialEntity);
    }

    private void saveCasingSealTypeEntity(Integer value, String name) {
        CasingSealTypeEntity casingSealTypeEntity = new CasingSealTypeEntity();
        casingSealTypeEntity.setValue(value);
        casingSealTypeEntity.setName(name);
        casingSealTypeRepository.save(casingSealTypeEntity);
    }

    private void saveCasingTypeEntity(Integer value, String name) {
        CasingTypeEntity casingTypeEntity = new CasingTypeEntity();
        casingTypeEntity.setValue(value);
        casingTypeEntity.setName(name);
        casingTypeRepository.save(casingTypeEntity);
    }

    private void saveCatalogEntity(String value, String name) {
        CatalogEntity catalogEntity = new CatalogEntity();
        catalogEntity.setValue(value);
        catalogEntity.setName(name);
        catalogRepository.save(catalogEntity);
    }

    private void saveClassTypeEntity(Integer value, String name) {
        ClassTypeEntity classTypeEntity = new ClassTypeEntity();
        classTypeEntity.setValue(value);
        classTypeEntity.setName(name);
        classTypeRepository.save(classTypeEntity);
    }

    private void saveClosureTypeEntity(Integer value, String name) {
        ClosureTypeEntity closureTypeEntity = new ClosureTypeEntity();
        closureTypeEntity.setValue(value);
        closureTypeEntity.setName(name);
        closureTypeRepository.save(closureTypeEntity);
    }

    private void saveCoatingConditionEntity(Integer value, String name) {
        CoatingConditionEntity coatingConditionEntity = new CoatingConditionEntity();
        coatingConditionEntity.setValue(value);
        coatingConditionEntity.setName(name);
        coatingConditionRepository.save(coatingConditionEntity);
    }

    private void saveCoatingMaterialEntity(Integer value, String name) {
        CoatingMaterialEntity coatingMaterialEntity = new CoatingMaterialEntity();
        coatingMaterialEntity.setValue(value);
        coatingMaterialEntity.setName(name);
        coatingMaterialRepository.save(coatingMaterialEntity);
    }

    private void saveCoatingSourceEntity(Integer value, String name) {
        CoatingSourceEntity coatingSourceEntity = new CoatingSourceEntity();
        coatingSourceEntity.setValue(value);
        coatingSourceEntity.setName(name);
        coatingSourceRepository.save(coatingSourceEntity);
    }

    private void saveComeFromFlagEntity(Integer value, String name) {
        ComeFromFlagEntity comeFromFlagEntity = new ComeFromFlagEntity();
        comeFromFlagEntity.setValue(value);
        comeFromFlagEntity.setName(name);
        comeFromFlagRepository.save(comeFromFlagEntity);
    }

    private void saveCompanyTypeEntity(Integer value, String name) {
        CompanyTypeEntity companyTypeEntity = new CompanyTypeEntity();
        companyTypeEntity.setValue(value);
        companyTypeEntity.setName(name);
        companyTypeRepository.save(companyTypeEntity);
    }

    private void saveContactTypeEntity(Integer value, String name) {
        ContactTypeEntity contactTypeEntity = new ContactTypeEntity();
        contactTypeEntity.setValue(value);
        contactTypeEntity.setName(name);
        contactTypeRepository.save(contactTypeEntity);
    }

    private void saveContractTypeEntity(Integer value, String name) {
        ContractTypeEntity contractTypeEntity = new ContractTypeEntity();
        contractTypeEntity.setValue(value);
        contractTypeEntity.setName(name);
        contractTypeRepository.save(contractTypeEntity);
    }

    private void saveControlPointTypeEntity(Integer value, String name) {
        ControlPointTypeEntity controlPointTypeEntity = new ControlPointTypeEntity();
        controlPointTypeEntity.setValue(value);
        controlPointTypeEntity.setName(name);
        controlPointTypeRepository.save(controlPointTypeEntity);
    }

    private void saveCoodiPrecisionEntity(Integer value, String name) {
        CoodiPrecisionEntity coodiPrecisionEntity = new CoodiPrecisionEntity();
        coodiPrecisionEntity.setValue(value);
        coodiPrecisionEntity.setName(name);
        coodiPrecisionRepository.save(coodiPrecisionEntity);
    }

    private void saveCorrosionDegreeEntity(Integer value, String name) {
        CorrosionDegreeEntity corrosionDegreeEntity = new CorrosionDegreeEntity();
        corrosionDegreeEntity.setValue(value);
        corrosionDegreeEntity.setName(name);
        corrosionDegreeRepository.save(corrosionDegreeEntity);
    }

    private void saveCPPowerWorkTypeEntity(Integer value, String name) {
        CPPowerWorkTypeEntity cpPowerWorkTypeEntity = new CPPowerWorkTypeEntity();
        cpPowerWorkTypeEntity.setValue(value);
        cpPowerWorkTypeEntity.setName(name);
        cpPowerWorkTypeRepository.save(cpPowerWorkTypeEntity);
    }

    private void saveCPStatusEntity(Integer value, String name) {
        CPStatusEntity cpStatusEntity = new CPStatusEntity();
        cpStatusEntity.setValue(value);
        cpStatusEntity.setName(name);
        cpStatusRepository.save(cpStatusEntity);
    }

    private void saveCrackTypeEntity(Integer value, String name) {
        CrackTypeEntity crackTypeEntity = new CrackTypeEntity();
        crackTypeEntity.setValue(value);
        crackTypeEntity.setName(name);
        crackTypeRepository.save(crackTypeEntity);
    }

    private void saveCrossingMethodEntity(Integer value, String name) {
        CrossingMethodEntity crossingMethodEntity = new CrossingMethodEntity();
        crossingMethodEntity.setValue(value);
        crossingMethodEntity.setName(name);
        crossingMethodRepository.save(crossingMethodEntity);
    }

    private void saveCrossingObjectEntity(Integer value, String name) {
        CrossingObjectEntity crossingObjectEntity = new CrossingObjectEntity();
        crossingObjectEntity.setValue(value);
        crossingObjectEntity.setName(name);
        crossingObjectRepository.save(crossingObjectEntity);
    }

    private void saveCrossingStatusEntity(Integer value, String name) {
        CrossingStatusEntity crossingStatusEntity = new CrossingStatusEntity();
        crossingStatusEntity.setValue(value);
        crossingStatusEntity.setName(name);
        crossingStatusRepository.save(crossingStatusEntity);
    }

    private void saveCurrentTypeEntity(Integer value, String name) {
        CurrentTypeEntity currentTypeEntity = new CurrentTypeEntity();
        currentTypeEntity.setValue(value);
        currentTypeEntity.setName(name);
        currentTypeRepository.save(currentTypeEntity);
    }

    private void saveDataResolutionEntity(Integer value, String name) {
        DataResolutionEntity dataResolutionEntity = new DataResolutionEntity();
        dataResolutionEntity.setValue(value);
        dataResolutionEntity.setName(name);
        dataResolutionRepository.save(dataResolutionEntity);
    }

    private void saveDataSourceEntity(Integer value, String name) {
        DataSourceEntity dataSourceEntity = new DataSourceEntity();
        dataSourceEntity.setValue(value);
        dataSourceEntity.setName(name);
        dataSourceRepository.save(dataSourceEntity);
    }

    private void saveDataStatusEntity(Integer value, String name) {
        DataStatusEntity dataStatusEntity = new DataStatusEntity();
        dataStatusEntity.setValue(value);
        dataStatusEntity.setName(name);
        dataStatusRepository.save(dataStatusEntity);
    }

    private void saveDaysOfWeekEntity(Integer value, String name) {
        DaysOfWeekEntity daysOfWeekEntity = new DaysOfWeekEntity();
        daysOfWeekEntity.setValue(value);
        daysOfWeekEntity.setName(name);
        daysOfWeekRepository.save(daysOfWeekEntity);
    }

    private void saveDefectiveConditionEntity(Integer value, String name) {
        DefectiveConditionEntity defectiveConditionEntity = new DefectiveConditionEntity();
        defectiveConditionEntity.setValue(value);
        defectiveConditionEntity.setName(name);
        defectiveConditionRepository.save(defectiveConditionEntity);
    }

    private void saveDentTypeEntity(Integer value, String name, String featureType) {
        DentTypeEntity dentTypeEntity = new DentTypeEntity();
        dentTypeEntity.setValue(value);
        dentTypeEntity.setName(name);
        FeatureTypeEntity featureTypeEntity = getFeatureTypeEntityByValue(featureType);
        dentTypeEntity.setFeatureTypeEntityById(featureTypeEntity);
        dentTypeRepository.save(dentTypeEntity);
    }

    private FeatureTypeEntity getFeatureTypeEntityByValue(String value) {
        for (Iterator<FeatureTypeEntity> iter = featureTypeRepository.findAll().iterator(); iter.hasNext(); ) {
            FeatureTypeEntity featureTypeEntity = iter.next();
            if (featureTypeEntity.getValue().equals(value)) {
                return featureTypeEntity;
            }
        }
        throw new UnknownError("the value of FeatureType table is not existent!");
    }

    private void saveDetectionTypeEntity(Integer value, String name) {
        DetectionTypeEntity detectionTypeEntity = new DetectionTypeEntity();
        detectionTypeEntity.setValue(value);
        detectionTypeEntity.setName(name);
        detectionTypeRepository.save(detectionTypeEntity);
    }

    private void saveDisasterTypeEntity(Integer value, String name) {
        DisasterTypeEntity disasterTypeEntity = new DisasterTypeEntity();
        disasterTypeEntity.setValue(value);
        disasterTypeEntity.setName(name);
        disasterTypeRepository.save(disasterTypeEntity);
    }

    private void saveDisturbanceEntity(Integer value, String name) {
        DisturbanceEntity disturbanceEntity = new DisturbanceEntity();
        disturbanceEntity.setValue(value);
        disturbanceEntity.setName(name);
        disturbanceRepository.save(disturbanceEntity);
    }

    private void saveEasyAreaTypeEntity(Integer value, String name) {
        EasyAreaTypeEntity easyAreaTypeEntity = new EasyAreaTypeEntity();
        easyAreaTypeEntity.setValue(value);
        easyAreaTypeEntity.setName(name);
        easyAreaTypeRepository.save(easyAreaTypeEntity);
    }

    private void saveElbowAngleEntity(Integer value, String name) {
        ElbowAngleEntity elbowAngleEntity = new ElbowAngleEntity();
        elbowAngleEntity.setValue(value);
        elbowAngleEntity.setName(name);
        elbowAngleRepository.save(elbowAngleEntity);
    }

    private void saveElbowTypeEntity(Integer value, String name) {
        ElbowTypeEntity elbowTypeEntity = new ElbowTypeEntity();
        elbowTypeEntity.setValue(value);
        elbowTypeEntity.setName(name);
        elbowTypeRepository.save(elbowTypeEntity);
    }

    private void saveEmergencyServiceEntity(Integer value, String name) {
        EmergencyServiceEntity emergencyServiceEntity = new EmergencyServiceEntity();
        emergencyServiceEntity.setValue(value);
        emergencyServiceEntity.setName(name);
        emergencyServiceRepository.save(emergencyServiceEntity);
    }

    private void saveEvaluationResultsEntity(Integer value, String name) {
        EvaluationResultsEntity evaluationResultsEntity = new EvaluationResultsEntity();
        evaluationResultsEntity.setValue(value);
        evaluationResultsEntity.setName(name);
        evaluationResultsRepository.save(evaluationResultsEntity);
    }

    private void saveFailureModeEntity(Integer value, String name) {
        FailureModeEntity failureModeEntity = new FailureModeEntity();
        failureModeEntity.setValue(value);
        failureModeEntity.setName(name);
        failureModeRepository.save(failureModeEntity);
    }

    private void saveFailureTypeEntity(String value, String name) {
        FailureTypeEntity failureTypeEntity = new FailureTypeEntity();
        failureTypeEntity.setValue(value);
        failureTypeEntity.setName(name);
        failureTypeRepository.save(failureTypeEntity);
    }

    private void saveFaultLineDirectionEntity(Integer value, String name) {
        FaultLineDirectionEntity faultLineDirectionEntity = new FaultLineDirectionEntity();
        faultLineDirectionEntity.setValue(value);
        faultLineDirectionEntity.setName(name);
        faultLineDirectionRepository.save(faultLineDirectionEntity);
    }

    private void saveFaultTypeEntity(Integer value, String name) {
        FaultTypeEntity faultTypeEntity = new FaultTypeEntity();
        faultTypeEntity.setValue(value);
        faultTypeEntity.setName(name);
        faultTypeRepository.save(faultTypeEntity);
    }

    private void saveFcrepStatusEntity(Integer value, String name) {
        FcrepStatusEntity fcrepStatusEntity = new FcrepStatusEntity();
        fcrepStatusEntity.setValue(value);
        fcrepStatusEntity.setName(name);
        fcrepStatusRepository.save(fcrepStatusEntity);
    }

    private void saveFeatureClassEntity(Integer value, String name) {
        FeatureClassEntity featureClassEntity = new FeatureClassEntity();
        featureClassEntity.setValue(value);
        featureClassEntity.setName(name);
        featureClassRepository.save(featureClassEntity);
    }

    private void saveFeatureTypeEntity(String value, String name) {
        FeatureTypeEntity featureTypeEntity = new FeatureTypeEntity();
        featureTypeEntity.setValue(value);
        featureTypeEntity.setName(name);
        featureTypeRepository.save(featureTypeEntity);
    }

    private void saveFittingMaterialEntity(Integer value, String name) {
        FittingMaterialEntity fittingMaterialEntity = new FittingMaterialEntity();
        fittingMaterialEntity.setValue(value);
        fittingMaterialEntity.setName(name);
        fittingMaterialRepository.save(fittingMaterialEntity);
    }

    private void saveFloodClassEntity(Integer value, String name) {
        FloodClassEntity floodClassEntity = new FloodClassEntity();
        floodClassEntity.setValue(value);
        floodClassEntity.setName(name);
        floodClassRepository.save(floodClassEntity);
    }

    private void saveFloodProMaterialTypeEntity(Integer value, String name) {
        FloodProMaterialTypeEntity floodProMaterialTypeEntity = new FloodProMaterialTypeEntity();
        floodProMaterialTypeEntity.setValue(value);
        floodProMaterialTypeEntity.setName(name);
        floodProMaterialTypeRepository.save(floodProMaterialTypeEntity);
    }

    private void saveFloodProTypeEntity(Integer value, String name) {
        FloodProTypeEntity floodProTypeEntity = new FloodProTypeEntity();
        floodProTypeEntity.setValue(value);
        floodProTypeEntity.setName(name);
        floodProTypeRepository.save(floodProTypeEntity);
    }

    private void saveForignPipeTypeEntity(Integer value, String name) {
        ForignPipeTypeEntity forignPipeTypeEntity = new ForignPipeTypeEntity();
        forignPipeTypeEntity.setValue(value);
        forignPipeTypeEntity.setName(name);
        forignPipeTypeRepository.save(forignPipeTypeEntity);
    }

    private void saveGalvanicAnodeMaterialEntity(Integer value, String name) {
        GalvanicAnodeMaterialEntity galvanicAnodeMaterialEntity = new GalvanicAnodeMaterialEntity();
        galvanicAnodeMaterialEntity.setValue(value);
        galvanicAnodeMaterialEntity.setName(name);
        galvanicAnodeMaterialRepository.save(galvanicAnodeMaterialEntity);
    }

    private void saveGalvanicAnodeWeightEntity(Integer value, String name) {
        GalvanicAnodeWeightEntity galvanicAnodeWeightEntity = new GalvanicAnodeWeightEntity();
        galvanicAnodeWeightEntity.setValue(value);
        galvanicAnodeWeightEntity.setName(name);
        galvanicAnodeWeightRepository.save(galvanicAnodeWeightEntity);
    }

    private void saveGBBackFillMaterialEntity(Integer value, String name) {
        GBBackFillMaterialEntity gbBackFillMaterialEntity = new GBBackFillMaterialEntity();
        gbBackFillMaterialEntity.setValue(value);
        gbBackFillMaterialEntity.setName(name);
        gbBackFillMaterialRepository.save(gbBackFillMaterialEntity);
    }

    private void saveGBStructureEntity(Integer value, String name) {
        GBStructureEntity gbStructureEntity = new GBStructureEntity();
        gbStructureEntity.setValue(value);
        gbStructureEntity.setName(name);
        gbStructureRepository.save(gbStructureEntity);
    }

    private void saveGeoRiskMeasureEntity(Integer value, String name) {
        GeoRiskMeasureEntity geoRiskMeasureEntity = new GeoRiskMeasureEntity();
        geoRiskMeasureEntity.setValue(value);
        geoRiskMeasureEntity.setName(name);
        geoRiskMeasureRepository.save(geoRiskMeasureEntity);
    }

    private void saveGradeEntity(Integer value, String name) {
        GradeEntity gradeEntity = new GradeEntity();
        gradeEntity.setValue(value);
        gradeEntity.setName(name);
        gradeRepository.save(gradeEntity);
    }

    private void saveHCATypeEntity(Integer value, String name) {
        HCATypeEntity hcaTypeEntity = new HCATypeEntity();
        hcaTypeEntity.setValue(value);
        hcaTypeEntity.setName(name);
        hcaTypeRepository.save(hcaTypeEntity);
    }

    private void saveHydroTypeEntity(Integer value, String name) {
        HydroTypeEntity hydroTypeEntity = new HydroTypeEntity();
        hydroTypeEntity.setValue(value);
        hydroTypeEntity.setName(name);
        hydroTypeRepository.save(hydroTypeEntity);
    }

    private void saveInspectionMethodEntity(Integer value, String name) {
        InspectionMethodEntity inspectionMethodEntity = new InspectionMethodEntity();
        inspectionMethodEntity.setValue(value);
        inspectionMethodEntity.setName(name);
        inspectionMethodRepository.save(inspectionMethodEntity);
    }

    private void saveIntegrityProposalEntity(Integer value, String name) {
        IntegrityProposalEntity integrityProposalEntity = new IntegrityProposalEntity();
        integrityProposalEntity.setValue(value);
        integrityProposalEntity.setName(name);
        integrityProposalRepository.save(integrityProposalEntity);
    }

    private void saveInternalExternalEntity(Integer value, String name) {
        InternalExternalEntity internalExternalEntity = new InternalExternalEntity();
        internalExternalEntity.setValue(value);
        internalExternalEntity.setName(name);
        internalExternalRepository.save(internalExternalEntity);
    }

    private void saveJointCoatingTypeEntity(Integer value, String name) {
        JointCoatingTypeEntity jointCoatingTypeEntity = new JointCoatingTypeEntity();
        jointCoatingTypeEntity.setValue(value);
        jointCoatingTypeEntity.setName(name);
        jointCoatingTypeRepository.save(jointCoatingTypeEntity);
    }

    private void saveLandUseTypeEntity(Integer value, String name) {
        LandUseTypeEntity landUseTypeEntity = new LandUseTypeEntity();
        landUseTypeEntity.setValue(value);
        landUseTypeEntity.setName(name);
        landUseTypeRepository.save(landUseTypeEntity);
    }

    private void saveLifeCycleEntity(Integer value, String name) {
        LifeCycleEntity lifeCycleEntity = new LifeCycleEntity();
        lifeCycleEntity.setValue(value);
        lifeCycleEntity.setName(name);
        lifeCycleRepository.save(lifeCycleEntity);
    }

    private void saveLineTypeEntity(Integer value, String name) {
        LineTypeEntity lineTypeEntity = new LineTypeEntity();
        lineTypeEntity.setValue(value);
        lineTypeEntity.setName(name);
        lineTypeRepository.save(lineTypeEntity);
    }

    private void saveManagerStatusEntity(Integer value, String name) {
        ManagerStatusEntity managerStatusEntity = new ManagerStatusEntity();
        managerStatusEntity.setValue(value);
        managerStatusEntity.setName(name);
        managerStatusRepository.save(managerStatusEntity);
    }

    private void saveMarkerStatusEntity(Integer value, String name) {
        MarkerStatusEntity markerStatusEntity = new MarkerStatusEntity();
        markerStatusEntity.setValue(value);
        markerStatusEntity.setName(name);
        markerStatusRepository.save(markerStatusEntity);
    }

    private void saveMarkerTypeEntity(Integer value, String name) {
        MarkerTypeEntity markerTypeEntity = new MarkerTypeEntity();
        markerTypeEntity.setValue(value);
        markerTypeEntity.setName(name);
        markerTypeRepository.save(markerTypeEntity);
    }

    private void saveMeaConPointGradeEntity(Integer value, String name) {
        MeaConPointGradeEntity meaConPointGradeEntity = new MeaConPointGradeEntity();
        meaConPointGradeEntity.setValue(value);
        meaConPointGradeEntity.setName(name);
        meaConPointGradeRepository.save(meaConPointGradeEntity);
    }

    private void saveMeaConPointTypeEntity(Integer value, String name) {
        MeaConPointTypeEntity meaConPointTypeEntity = new MeaConPointTypeEntity();
        meaConPointTypeEntity.setValue(value);
        meaConPointTypeEntity.setName(name);
        meaConPointTypeRepository.save(meaConPointTypeEntity);
    }

    private void saveMediaTypeEntity(Integer value, String name) {
        MediaTypeEntity mediaTypeEntity = new MediaTypeEntity();
        mediaTypeEntity.setValue(value);
        mediaTypeEntity.setName(name);
        mediaTypeRepository.save(mediaTypeEntity);
    }

    private void saveMediumTypeEntity(Integer value, String name) {
        MediumTypeEntity mediumTypeEntity = new MediumTypeEntity();
        mediumTypeEntity.setValue(value);
        mediumTypeEntity.setName(name);
        mediumTypeRepository.save(mediumTypeEntity);
    }

    private void saveMetalLossTypeEntity(Integer value, String name, String featureTypeValue) {
        MetalLossTypeEntity metalLossTypeEntity = new MetalLossTypeEntity();
        metalLossTypeEntity.setValue(value);
        metalLossTypeEntity.setName(name);
        FeatureTypeEntity featureTypeEntity = getFeatureTypeEntityByValue(featureTypeValue);
        metalLossTypeEntity.setFeatureTypeEntityById(featureTypeEntity);
        metalLossTypeRepository.save(metalLossTypeEntity);
    }

    private void saveMiscCrossingTypeEntity(Integer value, String name) {
        MiscCrossingTypeEntity miscCrossingTypeEntity = new MiscCrossingTypeEntity();
        miscCrossingTypeEntity.setValue(value);
        miscCrossingTypeEntity.setName(name);
        miscCrossingTypeRepository.save(miscCrossingTypeEntity);
    }

    private void saveMunicipalBndryTypeEntity(Integer value, String name) {
        MunicipalBndryTypeEntity municipalBndryTypeEntity = new MunicipalBndryTypeEntity();
        municipalBndryTypeEntity.setValue(value);
        municipalBndryTypeEntity.setName(name);
        municipalBndryTypeRepository.save(municipalBndryTypeEntity);
    }

    private void saveNDTTypeEntity(String value, String name) {
        NDTTypeEntity ndtTypeEntity = new NDTTypeEntity();
        ndtTypeEntity.setValue(value);
        ndtTypeEntity.setName(name);
        ndtTypeRepository.save(ndtTypeEntity);
    }

    private void saveNSPPipeMaterialEntity(Integer value, String name) {
        NSPPipeMaterialEntity nspPipeMaterialEntity = new NSPPipeMaterialEntity();
        nspPipeMaterialEntity.setValue(value);
        nspPipeMaterialEntity.setName(name);
        nspPipeMaterialRepository.save(nspPipeMaterialEntity);
    }

    private void saveOperatingPressureEntity(Integer value, String name) {
        OperatingPressureEntity operatingPressureEntity = new OperatingPressureEntity();
        operatingPressureEntity.setValue(value);
        operatingPressureEntity.setName(name);
        operatingPressureRepository.save(operatingPressureEntity);
    }

    private void saveOperationalStatusEntity(Integer value, String name) {
        OperationalStatusEntity operationalStatusEntity = new OperationalStatusEntity();
        operationalStatusEntity.setValue(value);
        operationalStatusEntity.setName(name);
        operationalStatusRepository.save(operationalStatusEntity);
    }

    private void saveOperatorTypeEntity(Integer value, String name) {
        OperatorTypeEntity operatorTypeEntity = new OperatorTypeEntity();
        operatorTypeEntity.setValue(value);
        operatorTypeEntity.setName(name);
        operatorTypeRepository.save(operatorTypeEntity);
    }

    private void savePatrolPeriodsEntity(Integer value, String name) {
        PatrolPeriodsEntity patrolPeriodsEntity = new PatrolPeriodsEntity();
        patrolPeriodsEntity.setValue(value);
        patrolPeriodsEntity.setName(name);
        patrolPeriodsRepository.save(patrolPeriodsEntity);
    }

    private void savePatrolTypeEntity(Integer value, String name) {
        PatrolTypeEntity patrolTypeEntity = new PatrolTypeEntity();
        patrolTypeEntity.setValue(value);
        patrolTypeEntity.setName(name);
        patrolTypeRepository.save(patrolTypeEntity);
    }

    private void savePCMDCACEntity(Integer value, String name) {
        PCMDCACEntity pcmdcacEntity = new PCMDCACEntity();
        pcmdcacEntity.setValue(value);
        pcmdcacEntity.setName(name);
        pcmdcacRepository.save(pcmdcacEntity);
    }

    private void savePercentageEntity(Integer value, String name) {
        PercentageEntity percentageEntity = new PercentageEntity();
        percentageEntity.setValue(value);
        percentageEntity.setName(name);
        percentageRepository.save(percentageEntity);
    }

    private void savePigStructureTypeEntity(Integer value, String name) {
        PigStructureTypeEntity pigStructureTypeEntity = new PigStructureTypeEntity();
        pigStructureTypeEntity.setValue(value);
        pigStructureTypeEntity.setName(name);
        pigStructureTypeRepository.save(pigStructureTypeEntity);
    }

    private void savePipeDiameterEntity(Integer value, String name) {
        PipeDiameterEntity pipeDiameterEntity = new PipeDiameterEntity();
        pipeDiameterEntity.setValue(value);
        pipeDiameterEntity.setName(name);
        pipeDiameterRepository.save(pipeDiameterEntity);
    }

    private void savePipeJoinTypeEntity(Integer value, String name) {
        PipeJoinTypeEntity pipeJoinTypeEntity = new PipeJoinTypeEntity();
        pipeJoinTypeEntity.setValue(value);
        pipeJoinTypeEntity.setName(name);
        pipeJoinTypeRepository.save(pipeJoinTypeEntity);
    }

    private void savePipelineDiameterEntity(Integer value, String name) {
        PipelineDiameterEntity pipelineDiameterEntity = new PipelineDiameterEntity();
        pipelineDiameterEntity.setValue(value);
        pipelineDiameterEntity.setName(name);
        pipelineDiameterRepository.save(pipelineDiameterEntity);
    }

    private void savePipeRepairEntity(Integer value, String name) {
        PipeRepairEntity pipeRepairEntity = new PipeRepairEntity();
        pipeRepairEntity.setValue(value);
        pipeRepairEntity.setName(name);
        pipeRepairRepository.save(pipeRepairEntity);
    }

    private void savePipeRepMethodEntity(Integer value, String name) {
        PipeRepMethodEntity pipeRepMethodEntity = new PipeRepMethodEntity();
        pipeRepMethodEntity.setValue(value);
        pipeRepMethodEntity.setName(name);
        pipeRepMethodRepository.save(pipeRepMethodEntity);
    }

    private void savePipeSeamTypeEntity(Integer value, String name) {
        PipeSeamTypeEntity pipeSeamTypeEntity = new PipeSeamTypeEntity();
        pipeSeamTypeEntity.setValue(value);
        pipeSeamTypeEntity.setName(name);
        pipeSeamTypeRepository.save(pipeSeamTypeEntity);
    }

    private void savePipeSegMaterialEntity(Integer value, String name) {
        PipeSegMaterialEntity pipeSegMaterialEntity = new PipeSegMaterialEntity();
        pipeSegMaterialEntity.setValue(value);
        pipeSegMaterialEntity.setName(name);
        pipeSegMaterialRepository.save(pipeSegMaterialEntity);
    }

    private void savePipeSegTypeEntity(Integer value, String name) {
        PipeSegTypeEntity pipeSegTypeEntity = new PipeSegTypeEntity();
        pipeSegTypeEntity.setValue(value);
        pipeSegTypeEntity.setName(name);
        pipeSegTypeRepository.save(pipeSegTypeEntity);
    }

    private void savePowerOperatingAmpsOutEntity(Integer value, String name) {
        PowerOperatingAmpsOutEntity powerOperatingAmpsOutEntity = new PowerOperatingAmpsOutEntity();
        powerOperatingAmpsOutEntity.setValue(value);
        powerOperatingAmpsOutEntity.setName(name);
        powerOperatingAmpsOutRepository.save(powerOperatingAmpsOutEntity);
    }

    private void savePowerOperatingVoltsOutEntity(Integer value, String name) {
        PowerOperatingVoltsOutEntity powerOperatingVoltsOutEntity = new PowerOperatingVoltsOutEntity();
        powerOperatingVoltsOutEntity.setValue(value);
        powerOperatingVoltsOutEntity.setName(name);
        powerOperatingVoltsOutRepository.save(powerOperatingVoltsOutEntity);
    }

    private void savePowerProtectTypeEntity(Integer value, String name) {
        PowerProtectTypeEntity powerProtectTypeEntity = new PowerProtectTypeEntity();
        powerProtectTypeEntity.setValue(value);
        powerProtectTypeEntity.setName(name);
        powerProtectTypeRepository.save(powerProtectTypeEntity);
    }

    private void savePowerRatedAmpsOutEntity(Integer value, String name) {
        PowerRatedAmpsOutEntity powerRatedAmpsOutEntity = new PowerRatedAmpsOutEntity();
        powerRatedAmpsOutEntity.setValue(value);
        powerRatedAmpsOutEntity.setName(name);
        powerRatedAmpsOutRepository.save(powerRatedAmpsOutEntity);
    }

    private void savePowerRatedVoltsOutEntity(Integer value, String name) {
        PowerRatedVoltsOutEntity powerRatedVoltsOutEntity = new PowerRatedVoltsOutEntity();
        powerRatedVoltsOutEntity.setValue(value);
        powerRatedVoltsOutEntity.setName(name);
        powerRatedVoltsOutRepository.save(powerRatedVoltsOutEntity);
    }

    private void savePowerTypeEntity(Integer value, String name) {
        PowerTypeEntity powerTypeEntity = new PowerTypeEntity();
        powerTypeEntity.setValue(value);
        powerTypeEntity.setName(name);
        powerTypeRepository.save(powerTypeEntity);
    }

    private void savePressureRatingEntity(Integer value, String name) {
        PressureRatingEntity pressureRatingEntity = new PressureRatingEntity();
        pressureRatingEntity.setValue(value);
        pressureRatingEntity.setName(name);
        pressureRatingRepository.save(pressureRatingEntity);
    }

    private void savePressureTestTypeEntity(Integer value, String name) {
        PressureTestTypeEntity pressureTestTypeEntity = new PressureTestTypeEntity();
        pressureTestTypeEntity.setValue(value);
        pressureTestTypeEntity.setName(name);
        pressureTestTypeRepository.save(pressureTestTypeEntity);
    }
}
