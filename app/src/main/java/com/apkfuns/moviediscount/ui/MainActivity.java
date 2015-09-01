package com.apkfuns.moviediscount.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.apkfuns.moviediscount.R;
import com.apkfuns.moviediscount.fragment.MainFragment;
import com.apkfuns.moviediscount.fragment.base.BaseFragment;
import com.apkfuns.moviediscount.ui.base.BaseActivity;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends BaseActivity implements Drawer.OnDrawerItemClickListener {
    private Drawer result = null;
    private AccountHeader accountHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accountHeader = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeightDp(200)
                .withCompactStyle(true)
                .withHeaderBackground(R.mipmap.drawer_header)
                .withSavedInstance(savedInstanceState)
                .build();
        result = new DrawerBuilder()
                .withActivity(this)
                .withAccountHeader(accountHeader)
                .withToolbar(getToolBar())
                .addDrawerItems(getDrawerItems())
                .withOnDrawerItemClickListener(this)
                .withSavedInstance(savedInstanceState)
                .withShowDrawerOnFirstLaunch(true)
                .build();
        if (savedInstanceState == null) {
            result.setSelectionByIdentifier(0, false);
        }
        setPage(new MainFragment());
    }

    @Override
    public boolean onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {
        switch (i) {
            case 0:
                setPage(new MainFragment());
                break;
            default:
                break;
        }
        return false;
    }

    /**
     * 切换默认视图
     *
     * @param fragment
     */
    private void setPage(BaseFragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

    /**
     * 获取菜单
     *
     * @return
     */
    private IDrawerItem[] getDrawerItems() {
        String[] values = getResources().getStringArray(R.array.slide_menu_value);
        String[] icons = getResources().getStringArray(R.array.slide_menu_icon);
        IDrawerItem[] items = new IDrawerItem[values.length];
        for (int i = 0; i < values.length; ++i) {
            items[i] = new PrimaryDrawerItem().withName(values[i])
                    .withIcon(getResources().getDrawable(getResources().getIdentifier(icons[i],
                                    "drawable", getApplicationInfo().packageName)
                    )).withIdentifier(i).withCheckable(false);
        }
        return items;
    }

    @Override
    public boolean showBackIcon() {
        return false;
    }
}