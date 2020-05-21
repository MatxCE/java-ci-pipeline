java-ci-pipeline
<target name="java-ci-pipeline" >
 <property name="store.jar.name" value="java-ci-pipeline"/>
        <property name="store.dir" value="store"/>
        <property name="store.jar" value="${store.dir}/${store.jar.name}.jar"/>
        <echo message="Packaging ${application.title} into a single JAR at ${store.jar}"/>
        <delete dir="${store.dir}"/>
        <mkdir dir="${store.dir}"/>
        <mkdir dir="dist/lib"/>
        <jar destfile="${store.dir}/temp_final.jar" filesetmanifest="skip">
            <zipgroupfileset dir="dist" includes="*.jar"/>
            <zipgroupfileset dir="dist/lib" includes="*.jar"/>
            <manifest>
                <attribute name="Main-Class" value="${main.class}"/>
            </manifest>
        </jar>
        <zip destfile="${store.jar}">
            <zipfileset src="${store.dir}/temp_final.jar"
                    excludes="META-INF/*.SF, META-INF/*.DSA, META-INF/*.RSA"/>
        </zip>
        <delete file="${store.dir}/temp_final.jar"/>

 </target
