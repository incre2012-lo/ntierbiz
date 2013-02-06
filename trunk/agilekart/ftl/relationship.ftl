	-------------------------------------------------------------------------------------------------------------------------
	@XmlElement(name = "${Entity1}${Entity2}")
	protected List<${BigEntity1}${BigEntity2}Assign> ${Entity1}${BigEntities2}Assign;
	
	public List<${BigEntity1}${BigEntity2}Assign> get${BigEntity1}${BigEntities2}Assign() {
		return ${Entity1}${BigEntities2}Assign;
	}

	public void set${BigEntity1}${BigEntities2}Assign(
			List<${BigEntity1}${BigEntity2}Assign> ${Entity1}${BigEntities2}Assign) {
		this.${Entity1}${BigEntities2}Assign = ${Entity1}${BigEntities2}Assign;
	}
	
	public void add${BigEntity1}${BigEntity2}Assign(${BigEntity1}${BigEntity2}Assign ${Entity1}${Entity2}) {
		this.${Entity1}${BigEntities2}Assign.add(${Entity1}${Entity2});
	}

	public ${BigEntity1}${BigEntity2}Assign create${BigEntity1}${BigEntity2}Assign(String ${Entity1}id,String ${Entity2}id){	
		${BigEntity1}${BigEntity2}Assign ${Entity1}${Entity2}=new ${BigEntity1}${BigEntity2}Assign();
		${Entity1}${Entity2}.set${BigEntity1}ID(${Entity1}id);
		${Entity1}${Entity2}.set${BigEntity2}ID(${Entity2}id);
		return ${Entity1}${Entity2};
	}
	
	public void assign${BigEntity1}${BigEntity2}(String ${Entity1}id,String ${Entity2}id){	
		${BigEntity1}${BigEntity2}Assign ${Entity1}${Entity2} =create${BigEntity1}${BigEntity2}Assign(${Entity1}id,${Entity2}id);
		get${BigEntity1}${BigEntities2}Assign().add(${Entity1}${Entity2});		
	}
	
	public boolean is${BigEntity1}${BigEntity2}Assign(String ${Entity1}id,String ${Entity2}id) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(${Entity1}id);
		EqualPredicate catEqlPredicate = new EqualPredicate(${Entity2}id);
		BeanPredicate prdbeanPredicate = new BeanPredicate("${Entity1}ID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("${Entity2}ID", catEqlPredicate);
		return CollectionUtils.exists(get${BigEntity1}${BigEntities2}Assign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ${BigEntity1}${BigEntity2}Assign find${BigEntity1}${BigEntity2}Assign(String ${Entity1}id,String ${Entity2}id) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(${Entity1}id);
		EqualPredicate catEqlPredicate = new EqualPredicate(${Entity2}id);
		BeanPredicate prdbeanPredicate = new BeanPredicate("${Entity1}ID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("${Entity2}ID", catEqlPredicate);
		return (${BigEntity1}${BigEntity2}Assign) CollectionUtils.find(get${BigEntity1}${BigEntities2}Assign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}

	---------------------------------------------------------------------------------------------------------------------------------------------
	private ${BigEntity2}Mgr ${Entity2}mgr;
	${Entity2}mgr=${BigEntity2}MgrFactory.getInstance().getMgr();
	
	public void assign${BigEntity1}To${BigEntity2}(${BigEntity1} ${Entity1},${BigEntity2} ${Entity2}){
		relmgr.assign${BigEntity1}${BigEntity2}(${Entity1}.get${BigEntity1}ID(), ${Entity2}.get${BigEntity2}ID());
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public List<${BigEntity2}> get${BigEntity1}${BigEntities2}(String ${Entity1}ID) {
		List<${BigEntity2}> list=new ArrayList<${BigEntity2}>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate nameEqlPredicate = new EqualPredicate(${Entity1}ID);
		BeanPredicate beanPredicate = new BeanPredicate("${Entity1}ID", nameEqlPredicate);		
		List <${BigEntity1}${BigEntity2}Assign> ${Entity1}${BigEntity2}Assign=(List<${BigEntity1}${BigEntity2}Assign>) CollectionUtils.select(relmgr.get${BigEntity1}${BigEntities2}Assign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ${BigEntity1}${BigEntity2}Assign  assign = (${BigEntity1}${BigEntity2}Assign) object;
				  return ${Entity2}mgr.find${BigEntity2}(assign.get${BigEntity2}ID());
              }
		  };
		  CollectionUtils.collect(product${BigEntity2}Assign, transformer,list);
		return list;
	}
	---------------------------------------------------------------------------------------------------------------------------------------------
		private ${BigEntity1}Mgr ${Entity1}mgr;
		${Entity1}mgr=${BigEntity1}MgrFactory.getInstance().getMgr();
		
	public List<${BigEntity1}> get${BigEntity2}${BigEntities1}(String ${Entity2}ID) {
		List<${BigEntity1}> list=new ArrayList<${BigEntity1}>();
		if(relmgr==null){
			return list;				
		}		
		EqualPredicate nameEqlPredicate = new EqualPredicate(${Entity2}ID);
		BeanPredicate beanPredicate = new BeanPredicate("${Entity2}ID", nameEqlPredicate);		
		List <${BigEntity1}${BigEntity2}Assign> ${Entity1}${BigEntity2}Assign=(List<${BigEntity1}${BigEntity2}Assign>) CollectionUtils.select(relmgr.get${BigEntity1}${BigEntities2}Assign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ${BigEntity1}${BigEntity2}Assign  assign = (${BigEntity1}${BigEntity2}Assign) object;
				  return ${Entity1}mgr.find${BigEntity1}(assign.get${BigEntity1}ID());
              }
		  };
		  CollectionUtils.collect(${Entity1}${BigEntity2}Assign, transformer,list);
		return list;
	}
	
	public void assign${BigEntity2}To${BigEntity1}(${BigEntity2} ${Entity2},${BigEntity1} ${Entity1}){
		relmgr.assign${BigEntity1}${BigEntity2}(${Entity1}.get${BigEntity1}ID(), ${Entity2}.get${BigEntity2}ID());
		RelationMgrFactory.getInstance().persist();
	}
	----------------------------------------------------------------------------------------------------------------
	   <${Entity1}${Entity2}  ${Entity2}ID="testcat1"  ${Entity1}ID="test3"/>
   ----------------------------------------------------------------------------------------------------------------
  