// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.touchizen.drawerwithbottomnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactTeamCardBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView FeedbackAttach;

  @NonNull
  public final EditText addtext;

  @NonNull
  public final CardView cardview2;

  @NonNull
  public final CardView contactteamcard1;

  @NonNull
  public final CardView description;

  @NonNull
  public final CardView firstCard;

  @NonNull
  public final CardView fourCard;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final CardView logoutBtn;

  @NonNull
  public final Button sbmitbutton;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final CardView secondCard;

  @NonNull
  public final CardView settingApp;

  @NonNull
  public final CardView shareApp;

  @NonNull
  public final EditText subject;

  @NonNull
  public final CardView thirdCard;

  @NonNull
  public final RelativeLayout toolbarContectFinvasys;

  @NonNull
  public final Toolbar toolbarSearch;

  private ActivityContactTeamCardBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView FeedbackAttach, @NonNull EditText addtext, @NonNull CardView cardview2,
      @NonNull CardView contactteamcard1, @NonNull CardView description,
      @NonNull CardView firstCard, @NonNull CardView fourCard, @NonNull AppBarLayout layoutmain,
      @NonNull CardView logoutBtn, @NonNull Button sbmitbutton, @NonNull ScrollView scrollView,
      @NonNull CardView secondCard, @NonNull CardView settingApp, @NonNull CardView shareApp,
      @NonNull EditText subject, @NonNull CardView thirdCard,
      @NonNull RelativeLayout toolbarContectFinvasys, @NonNull Toolbar toolbarSearch) {
    this.rootView = rootView;
    this.FeedbackAttach = FeedbackAttach;
    this.addtext = addtext;
    this.cardview2 = cardview2;
    this.contactteamcard1 = contactteamcard1;
    this.description = description;
    this.firstCard = firstCard;
    this.fourCard = fourCard;
    this.layoutmain = layoutmain;
    this.logoutBtn = logoutBtn;
    this.sbmitbutton = sbmitbutton;
    this.scrollView = scrollView;
    this.secondCard = secondCard;
    this.settingApp = settingApp;
    this.shareApp = shareApp;
    this.subject = subject;
    this.thirdCard = thirdCard;
    this.toolbarContectFinvasys = toolbarContectFinvasys;
    this.toolbarSearch = toolbarSearch;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactTeamCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactTeamCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contact_team_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactTeamCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Feedback_Attach;
      TextView FeedbackAttach = rootView.findViewById(id);
      if (FeedbackAttach == null) {
        break missingId;
      }

      id = R.id.addtext;
      EditText addtext = rootView.findViewById(id);
      if (addtext == null) {
        break missingId;
      }

      id = R.id.cardview2;
      CardView cardview2 = rootView.findViewById(id);
      if (cardview2 == null) {
        break missingId;
      }

      id = R.id.contactteamcard1;
      CardView contactteamcard1 = rootView.findViewById(id);
      if (contactteamcard1 == null) {
        break missingId;
      }

      id = R.id.description;
      CardView description = rootView.findViewById(id);
      if (description == null) {
        break missingId;
      }

      id = R.id.first_card;
      CardView firstCard = rootView.findViewById(id);
      if (firstCard == null) {
        break missingId;
      }

      id = R.id.four_card;
      CardView fourCard = rootView.findViewById(id);
      if (fourCard == null) {
        break missingId;
      }

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.logoutBtn;
      CardView logoutBtn = rootView.findViewById(id);
      if (logoutBtn == null) {
        break missingId;
      }

      id = R.id.sbmitbutton;
      Button sbmitbutton = rootView.findViewById(id);
      if (sbmitbutton == null) {
        break missingId;
      }

      id = R.id.scrollView;
      ScrollView scrollView = rootView.findViewById(id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.second_card;
      CardView secondCard = rootView.findViewById(id);
      if (secondCard == null) {
        break missingId;
      }

      id = R.id.setting_app;
      CardView settingApp = rootView.findViewById(id);
      if (settingApp == null) {
        break missingId;
      }

      id = R.id.share_app;
      CardView shareApp = rootView.findViewById(id);
      if (shareApp == null) {
        break missingId;
      }

      id = R.id.subject;
      EditText subject = rootView.findViewById(id);
      if (subject == null) {
        break missingId;
      }

      id = R.id.third_card;
      CardView thirdCard = rootView.findViewById(id);
      if (thirdCard == null) {
        break missingId;
      }

      RelativeLayout toolbarContectFinvasys = (RelativeLayout) rootView;

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      return new ActivityContactTeamCardBinding((RelativeLayout) rootView, FeedbackAttach, addtext,
          cardview2, contactteamcard1, description, firstCard, fourCard, layoutmain, logoutBtn,
          sbmitbutton, scrollView, secondCard, settingApp, shareApp, subject, thirdCard,
          toolbarContectFinvasys, toolbarSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
