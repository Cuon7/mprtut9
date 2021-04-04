package com.a1_1801040028.mprtut9;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class BookmarksFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BookmarksFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BookmarksFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BookmarksFragment newInstance(String param1, String param2) {
        BookmarksFragment fragment = new BookmarksFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bookmarks, container, false);
        ImageButton btn_zing = (ImageButton) view.findViewById(R.id.image_zing);
        ImageButton btn_medium = (ImageButton) view.findViewById(R.id.image_medium);
        ImageButton btn_baomoi = (ImageButton) view.findViewById(R.id.image_baomoi);
        ImageButton btn_bluezone = (ImageButton) view.findViewById(R.id.image_bluezone);
        ImageButton btn_bonus = (ImageButton) view.findViewById(R.id.image_bonus);


        btn_zing.setOnClickListener(this);
        btn_bluezone.setOnClickListener(this);
        btn_baomoi.setOnClickListener(this);
        btn_medium.setOnClickListener(this);
        btn_bonus.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            // In landscape
            switch (v.getId()) {
                case R.id.image_baomoi:

                    FragmentManager managerGG = getFragmentManager();
                    Fragment fragmentBM = new WebViewFragment();

                    Bundle argsGG = new Bundle();
                    argsGG.putString("KEY", "https://baomoi.com/");
                    fragmentBM.setArguments(argsGG);
                    managerGG.beginTransaction()
                            .replace(R.id.web, fragmentBM)
                            .addToBackStack("back")
                            .commit();
                    break;
                case R.id.image_bluezone:
                    FragmentManager managerBZ = getFragmentManager();
                    Fragment fragmentBZ = new WebViewFragment();

                    Bundle args1 = new Bundle();
                    args1.putString("KEY", "https://bluezone.gov.vn/");
                    fragmentBZ.setArguments(args1);
                    managerBZ.beginTransaction()
                            .replace(R.id.web, fragmentBZ)
                            .addToBackStack("back")
                            .commit();
                    break;
                case R.id.image_medium:
                    FragmentManager managerFB = getFragmentManager();
                    Fragment fragmentMD = new WebViewFragment();

                    Bundle argFB = new Bundle();
                    argFB.putString("KEY", "https://medium.com/");
                    fragmentMD.setArguments(argFB);
                    managerFB.beginTransaction()
                            .replace(R.id.web, fragmentMD)
                            .addToBackStack("back")
                            .commit();
                    break;
                case R.id.image_zing:
                    FragmentManager managerZ = getFragmentManager();
                    Fragment fragmentZ = new WebViewFragment();

                    Bundle argsZ = new Bundle();
                    argsZ.putString("KEY", "https://zingmp3.vn");
                    fragmentZ.setArguments(argsZ);
                    managerZ.beginTransaction()
                            .replace(R.id.web, fragmentZ)
                            .addToBackStack("back")
                            .commit();
                    break;
                case R.id.image_bonus:
                    FragmentManager managerB = getFragmentManager();
                    Fragment fragmentB = new WebViewFragment();

                    Bundle argB = new Bundle();
                    argB.putString("KEY", "https://youtu.be/dQw4w9WgXcQ?t=43");
                    fragmentB.setArguments(argB);
                    managerB.beginTransaction()
                            .replace(R.id.web, fragmentB)
                            .addToBackStack("back")
                            .commit();
                    break;

                default:
                    Toast.makeText(getActivity(), "..!!!", Toast.LENGTH_SHORT).show();
            }
        } else{
                // In portrait
                switch (v.getId()) {
                    case R.id.image_baomoi:

                        FragmentManager managerGG = getFragmentManager();
                        Fragment fragmentBM = new WebViewFragment();

                        Bundle argsGG = new Bundle();
                        argsGG.putString("KEY", "https://baomoi.com/");
                        fragmentBM.setArguments(argsGG);
                        managerGG.beginTransaction()
                                .replace(R.id.container, fragmentBM)
                                .addToBackStack("back")
                                .commit();
                        break;
                    case R.id.image_bluezone:
                        FragmentManager managerBZ = getFragmentManager();
                        Fragment fragmentBZ = new WebViewFragment();

                        Bundle args1 = new Bundle();
                        args1.putString("KEY", "https://bluezone.gov.vn/");
                        fragmentBZ.setArguments(args1);
                        managerBZ.beginTransaction()
                                .replace(R.id.container, fragmentBZ)
                                .addToBackStack("back")
                                .commit();
                        break;
                    case R.id.image_medium:
                        FragmentManager managerFB = getFragmentManager();
                        Fragment fragmentMD = new WebViewFragment();

                        Bundle argFB = new Bundle();
                        argFB.putString("KEY", "https://medium.com/");
                        fragmentMD.setArguments(argFB);
                        managerFB.beginTransaction()
                                .replace(R.id.container, fragmentMD)
                                .addToBackStack("back")
                                .commit();
                        break;
                    case R.id.image_zing:
                        FragmentManager managerZ = getFragmentManager();
                        Fragment fragmentZ = new WebViewFragment();

                        Bundle argsZ = new Bundle();
                        argsZ.putString("KEY", "https://zingmp3.vn");
                        fragmentZ.setArguments(argsZ);
                        managerZ.beginTransaction()
                                .replace(R.id.container, fragmentZ)
                                .addToBackStack("back")
                                .commit();
                        break;
                    case R.id.image_bonus:
                        FragmentManager managerB = getFragmentManager();
                        Fragment fragmentB = new WebViewFragment();

                        Bundle argB = new Bundle();
                        argB.putString("KEY", "https://youtu.be/dQw4w9WgXcQ?t=43");
                        fragmentB.setArguments(argB);
                        managerB.beginTransaction()
                                .replace(R.id.container, fragmentB)
                                .addToBackStack("back")
                                .commit();
                        break;
                    default:
                        Toast.makeText(getActivity(), "..!!!", Toast.LENGTH_SHORT).show();
                }

            }


        }
    }
