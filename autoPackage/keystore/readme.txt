�û�������pptvƽ̨�������ϷΨһ��ʾgid

����ǩ���ļ���Ĭ�ϲ������£�

ǩ���ļ����ƣ�keystore:{gid}.keystore
ǩ���ļ����룺storepass:{gid}pptvas
������alias:{gid}.keystore
�������룺keypass:{gid}pptvvas



pptv��Ϸǩ�����ɹ����û��ɸ�����Ҫ�����޸�
cmd�������£�
String generateKeystoreCommand=String.format(getLocale(),"keytool -genkey -keyalg RSA -validity 36500 -alias %s -keystore %s -storepass %s -keypass %s -dname \"CN=pptvvas,OU=pptvvas,O=pptvvas,L=shanghai,ST=shanghai,C=CN\"",
						new Object[]{inputGid+".keystore",gameKeystorePath,inputGid+"pptvvas",inputGid+"pptvvas"});
