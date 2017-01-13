#ifndef DAP_MAIN_H_INCLUDED
#define DAP_MAIN_H_INCLUDED

#ifdef __cplusplus
extern "C" {
#endif
/*********************/
/* request port list */
/*********************/  
typedef struct {
    	
if(DAP_USE_LAT_ALGO_PARAMETERS> 0)
VehDyn_t *p_VehDyn_t;
#endif
	
if(DAP_USE_LAT_ALGO_PARAMETERS> 0)
xyz *p_xyz;
#endif
	
    }Exec_t_reqportPtrList;
 
/*********************/
/* provide port list */
/*********************/
typedef struct {
    	const VehDyn_t *p_VehDyn_t
	
	
	
    }Exec_t_proportPtrList;
void Exec (Exec_t_reqportPtrList const*const reqPort, Exec_t_proportPtrList const*const proPort);

	
	#ifdef __cplusplus
}
#endif
#endif /*DAP_EXT_H_INCLUDED*/