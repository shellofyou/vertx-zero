/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain;


import cn.vertxup.fm.domain.tables.FBank;
import cn.vertxup.fm.domain.tables.FBill;
import cn.vertxup.fm.domain.tables.FBillItem;
import cn.vertxup.fm.domain.tables.FBook;
import cn.vertxup.fm.domain.tables.FCurrency;
import cn.vertxup.fm.domain.tables.FDebt;
import cn.vertxup.fm.domain.tables.FInvoice;
import cn.vertxup.fm.domain.tables.FPayTerm;
import cn.vertxup.fm.domain.tables.FPayment;
import cn.vertxup.fm.domain.tables.FPaymentItem;
import cn.vertxup.fm.domain.tables.FPreAuthorize;
import cn.vertxup.fm.domain.tables.FSettlement;
import cn.vertxup.fm.domain.tables.FSettlementItem;
import cn.vertxup.fm.domain.tables.FSubject;

import java.util.Arrays;
import java.util.List;

import io.vertx.tp.ke.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Db extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DB_ETERNAL</code>
     */
    public static final Db DB_ETERNAL = new Db();

    /**
     * The table <code>DB_ETERNAL.F_BANK</code>.
     */
    public final FBank F_BANK = FBank.F_BANK;

    /**
     * The table <code>DB_ETERNAL.F_BILL</code>.
     */
    public final FBill F_BILL = FBill.F_BILL;

    /**
     * The table <code>DB_ETERNAL.F_BILL_ITEM</code>.
     */
    public final FBillItem F_BILL_ITEM = FBillItem.F_BILL_ITEM;

    /**
     * The table <code>DB_ETERNAL.F_BOOK</code>.
     */
    public final FBook F_BOOK = FBook.F_BOOK;

    /**
     * The table <code>DB_ETERNAL.F_CURRENCY</code>.
     */
    public final FCurrency F_CURRENCY = FCurrency.F_CURRENCY;

    /**
     * The table <code>DB_ETERNAL.F_DEBT</code>.
     */
    public final FDebt F_DEBT = FDebt.F_DEBT;

    /**
     * The table <code>DB_ETERNAL.F_INVOICE</code>.
     */
    public final FInvoice F_INVOICE = FInvoice.F_INVOICE;

    /**
     * The table <code>DB_ETERNAL.F_PAY_TERM</code>.
     */
    public final FPayTerm F_PAY_TERM = FPayTerm.F_PAY_TERM;

    /**
     * The table <code>DB_ETERNAL.F_PAYMENT</code>.
     */
    public final FPayment F_PAYMENT = FPayment.F_PAYMENT;

    /**
     * The table <code>DB_ETERNAL.F_PAYMENT_ITEM</code>.
     */
    public final FPaymentItem F_PAYMENT_ITEM = FPaymentItem.F_PAYMENT_ITEM;

    /**
     * The table <code>DB_ETERNAL.F_PRE_AUTHORIZE</code>.
     */
    public final FPreAuthorize F_PRE_AUTHORIZE = FPreAuthorize.F_PRE_AUTHORIZE;

    /**
     * The table <code>DB_ETERNAL.F_SETTLEMENT</code>.
     */
    public final FSettlement F_SETTLEMENT = FSettlement.F_SETTLEMENT;

    /**
     * The table <code>DB_ETERNAL.F_SETTLEMENT_ITEM</code>.
     */
    public final FSettlementItem F_SETTLEMENT_ITEM = FSettlementItem.F_SETTLEMENT_ITEM;

    /**
     * The table <code>DB_ETERNAL.F_SUBJECT</code>.
     */
    public final FSubject F_SUBJECT = FSubject.F_SUBJECT;

    /**
     * No further instances allowed
     */
    private Db() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            FBank.F_BANK,
            FBill.F_BILL,
            FBillItem.F_BILL_ITEM,
            FBook.F_BOOK,
            FCurrency.F_CURRENCY,
            FDebt.F_DEBT,
            FInvoice.F_INVOICE,
            FPayTerm.F_PAY_TERM,
            FPayment.F_PAYMENT,
            FPaymentItem.F_PAYMENT_ITEM,
            FPreAuthorize.F_PRE_AUTHORIZE,
            FSettlement.F_SETTLEMENT,
            FSettlementItem.F_SETTLEMENT_ITEM,
            FSubject.F_SUBJECT
        );
    }
}
