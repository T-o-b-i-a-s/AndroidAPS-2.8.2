package info.nightscout.androidaps.utils.userEntry

import info.nightscout.androidaps.database.entities.UserEntry

class UserEntryMapper {
    enum class Action (val db: UserEntry.Action) {
        BOLUS (UserEntry.Action.BOLUS),
        SMB (UserEntry.Action.SMB),
        BOLUS_ADVISOR (UserEntry.Action.BOLUS_ADVISOR),
        EXTENDED_BOLUS (UserEntry.Action.EXTENDED_BOLUS),
        SUPERBOLUS_TBR (UserEntry.Action.SUPERBOLUS_TBR),
        CARBS (UserEntry.Action.CARBS),
        EXTENDED_CARBS (UserEntry.Action.EXTENDED_CARBS),
        TEMP_BASAL (UserEntry.Action.TEMP_BASAL),
        TT (UserEntry.Action.TT),
        NEW_PROFILE (UserEntry.Action.NEW_PROFILE),
        CLONE_PROFILE (UserEntry.Action.CLONE_PROFILE),
        STORE_PROFILE (UserEntry.Action.STORE_PROFILE),
        PROFILE_SWITCH (UserEntry.Action.PROFILE_SWITCH),
        PROFILE_SWITCH_CLONED (UserEntry.Action.PROFILE_SWITCH_CLONED),
        CLOSED_LOOP_MODE (UserEntry.Action.CLOSED_LOOP_MODE),
        LGS_LOOP_MODE (UserEntry.Action.LGS_LOOP_MODE),
        OPEN_LOOP_MODE (UserEntry.Action.OPEN_LOOP_MODE),
        LOOP_DISABLED (UserEntry.Action.LOOP_DISABLED),
        LOOP_ENABLED (UserEntry.Action.LOOP_ENABLED),
        RECONNECT (UserEntry.Action.RECONNECT),
        DISCONNECT (UserEntry.Action.DISCONNECT),
        RESUME (UserEntry.Action.RESUME),
        SUSPEND (UserEntry.Action.SUSPEND),
        HW_PUMP_ALLOWED (UserEntry.Action.HW_PUMP_ALLOWED),
        CLEAR_PAIRING_KEYS (UserEntry.Action.CLEAR_PAIRING_KEYS),
        ACCEPTS_TEMP_BASAL (UserEntry.Action.ACCEPTS_TEMP_BASAL),
        CANCEL_TEMP_BASAL (UserEntry.Action.CANCEL_TEMP_BASAL),
        CANCEL_EXTENDED_BOLUS (UserEntry.Action.CANCEL_EXTENDED_BOLUS),
        CANCEL_TT (UserEntry.Action.CANCEL_TT),
        CAREPORTAL (UserEntry.Action.CAREPORTAL),
        SITE_CHANGE (UserEntry.Action.SITE_CHANGE),
        RESERVOIR_CHANGE (UserEntry.Action.RESERVOIR_CHANGE),
        CALIBRATION (UserEntry.Action.CALIBRATION),
        PRIME_BOLUS (UserEntry.Action.PRIME_BOLUS),
        TREATMENT (UserEntry.Action.TREATMENT),
        CAREPORTAL_NS_REFRESH (UserEntry.Action.CAREPORTAL_NS_REFRESH),
        PROFILE_SWITCH_NS_REFRESH (UserEntry.Action.PROFILE_SWITCH_NS_REFRESH),
        TREATMENTS_NS_REFRESH (UserEntry.Action.TREATMENTS_NS_REFRESH),
        TT_NS_REFRESH (UserEntry.Action.TT_NS_REFRESH),
        AUTOMATION_REMOVED (UserEntry.Action.AUTOMATION_REMOVED),
        BG_REMOVED (UserEntry.Action.BG_REMOVED),
        CAREPORTAL_REMOVED (UserEntry.Action.CAREPORTAL_REMOVED),
        EXTENDED_BOLUS_REMOVED (UserEntry.Action.EXTENDED_BOLUS_REMOVED),
        FOOD_REMOVED (UserEntry.Action.FOOD_REMOVED),
        PROFILE_REMOVED (UserEntry.Action.PROFILE_REMOVED),
        PROFILE_SWITCH_REMOVED (UserEntry.Action.PROFILE_SWITCH_REMOVED),
        RESTART_EVENTS_REMOVED (UserEntry.Action.RESTART_EVENTS_REMOVED),
        TREATMENT_REMOVED (UserEntry.Action.TREATMENT_REMOVED),
        BOLUS_REMOVED (UserEntry.Action.BOLUS_REMOVED),
        CARBS_REMOVED (UserEntry.Action.CARBS_REMOVED),
        TEMP_BASAL_REMOVED (UserEntry.Action.TEMP_BASAL_REMOVED),
        TT_REMOVED (UserEntry.Action.TT_REMOVED),
        NS_PAUSED (UserEntry.Action.NS_PAUSED),
        NS_RESUME (UserEntry.Action.NS_RESUME),
        NS_QUEUE_CLEARED (UserEntry.Action.NS_QUEUE_CLEARED),
        NS_SETTINGS_COPIED (UserEntry.Action.NS_SETTINGS_COPIED),
        ERROR_DIALOG_OK (UserEntry.Action.ERROR_DIALOG_OK),
        ERROR_DIALOG_MUTE (UserEntry.Action.ERROR_DIALOG_MUTE),
        ERROR_DIALOG_MUTE_5MIN (UserEntry.Action.ERROR_DIALOG_MUTE_5MIN),
        OBJECTIVE_STARTED (UserEntry.Action.OBJECTIVE_STARTED),
        OBJECTIVE_UNSTARTED (UserEntry.Action.OBJECTIVE_UNSTARTED),
        OBJECTIVES_SKIPPED (UserEntry.Action.OBJECTIVES_SKIPPED),
        STAT_RESET (UserEntry.Action.STAT_RESET),
        DELETE_LOGS (UserEntry.Action.DELETE_LOGS),
        DELETE_FUTURE_TREATMENTS (UserEntry.Action.DELETE_FUTURE_TREATMENTS),
        EXPORT_SETTINGS (UserEntry.Action.EXPORT_SETTINGS),
        IMPORT_SETTINGS (UserEntry.Action.IMPORT_SETTINGS),
        RESET_DATABASES (UserEntry.Action.RESET_DATABASES),
        EXPORT_DATABASES (UserEntry.Action.EXPORT_DATABASES),
        IMPORT_DATABASES (UserEntry.Action.IMPORT_DATABASES),
        OTP_EXPORT (UserEntry.Action.OTP_EXPORT),
        OTP_RESET (UserEntry.Action.OTP_RESET),
        STOP_SMS (UserEntry.Action.STOP_SMS),
        FOOD (UserEntry.Action.FOOD),
        EXPORT_CSV (UserEntry.Action.EXPORT_CSV),
        UNKNOWN (UserEntry.Action.UNKNOWN)
        ;
    }

    enum class Sources (val db: UserEntry.Sources) {
        TreatmentDialog (UserEntry.Sources.TreatmentDialog),
        InsulinDialog (UserEntry.Sources.InsulinDialog),
        CarbDialog (UserEntry.Sources.CarbDialog),
        WizardDialog (UserEntry.Sources.WizardDialog),
        QuickWizard (UserEntry.Sources.QuickWizard),
        ExtendedBolusDialog (UserEntry.Sources.ExtendedBolusDialog),
        TTDialog (UserEntry.Sources.TTDialog),
        ProfileSwitchDialog (UserEntry.Sources.ProfileSwitchDialog),
        LoopDialog (UserEntry.Sources.LoopDialog),
        TempBasalDialog (UserEntry.Sources.TempBasalDialog),
        CalibrationDialog (UserEntry.Sources.CalibrationDialog),
        FillDialog (UserEntry.Sources.FillDialog),
        BgCheck (UserEntry.Sources.BgCheck),
        SensorInsert (UserEntry.Sources.SensorInsert),
        BatteryChange (UserEntry.Sources.BatteryChange),
        Note (UserEntry.Sources.Note),
        Exercise (UserEntry.Sources.Exercise),
        Question (UserEntry.Sources.Question),
        Announcement (UserEntry.Sources.Announcement),
        Actions (UserEntry.Sources.Actions),
        Automation (UserEntry.Sources.Automation),
        BG (UserEntry.Sources.BG),
        LocalProfile (UserEntry.Sources.LocalProfile),
        Loop (UserEntry.Sources.Loop),
        Maintenance (UserEntry.Sources.Maintenance),
        NSClient (UserEntry.Sources.NSClient),
        NSProfile (UserEntry.Sources.NSProfile),
        Objectives (UserEntry.Sources.Objectives),
        Pump (UserEntry.Sources.Pump),
        Dana (UserEntry.Sources.Dana),
        DanaR (UserEntry.Sources.DanaR),
        DanaRC (UserEntry.Sources.DanaRC),
        DanaRv2 (UserEntry.Sources.DanaRv2),
        DanaRS (UserEntry.Sources.DanaRS),
        Insight (UserEntry.Sources.Insight),
        Combo (UserEntry.Sources.Combo),
        Medtronic (UserEntry.Sources.Medtronic),
        Omnipod (UserEntry.Sources.Omnipod),
        OmnipodEros (UserEntry.Sources.OmnipodEros),
        OmnipodDash (UserEntry.Sources.OmnipodDash),
        MDI (UserEntry.Sources.MDI),
        VirtualPump (UserEntry.Sources.VirtualPump),
        SMS (UserEntry.Sources.SMS),
        Treatments (UserEntry.Sources.Treatments),
        Wear (UserEntry.Sources.Wear),
        Food (UserEntry.Sources.Food),
        ConfigBuilder (UserEntry.Sources.ConfigBuilder),
        Overview (UserEntry.Sources.Overview),
        Stats (UserEntry.Sources.Stats),
        Unknown(UserEntry.Sources.Unknown)
        ;
    }
}