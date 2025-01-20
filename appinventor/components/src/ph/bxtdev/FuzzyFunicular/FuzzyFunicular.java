package ph.bxtdev.FuzzyFunicular;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
        versionName = "1",
        version = 1,
        description = "Gets environment's External Storage Directory - Made using <a href=\"https://github.com/philippinedeveloper/WarlockExtensionBuilder\">Warlock</a>",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "appinventor/components/src/ph/bxtdev/HelloWorld/aiwebres/icon.png")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class FuzzyFunicular extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public FuzzyFunicular(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleProperty(description = "Gets environment's External Storage Directory")
    public String GetExternalStorageDirectory(){
      return Environment.getExternalStorageDirectory.getAbsolutePath();
    }
}
